import java.util.Scanner;

class Class72{
	
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);

		int year;
		System.out.println("Enter the year :>  ");
		year = input.nextInt();

		if(year % 100 == 0 && year % 400 == 0 || year % 100 !=0 && year % 4 == 0)
		{
			System.out.println(year+"	is Leap year");
		}
		else{
				System.out.println("1st Stage Error ");
		}

	}
}