import java.util.Scanner;

class Class_69{
	
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		char alphabat,result;
		System.out.println("Enter the Alphabat : ");
		alphabat = input.next().charAt(0);

		if(alphabat >= 'A' || alphabat <= 'Z' || alphabat >= 'a' || alphabat <= 'z')
		{
				if(alphabat == 'A' || alphabat == 'Z')
		{
			result= Character.toLowerCase(alphabat);
			System.out.println("Result : "+ result);
		}
		else{
			result= Character.toUpperCase(alphabat);
			System.out.println("Result : "+ result);
		}
		}
	}
}