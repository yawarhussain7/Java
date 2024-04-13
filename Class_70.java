import java.util.Scanner;

class Class_70{
	
	public static void main(String args[])
	{
	Scanner input = new Scanner(System.in);
		int num;
		System.out.println("Enter the any number : ");
		num = input.nextInt();

		if(num < 0)
		{
			System.out.println(num+"	is Negative ");

		}
		else if(num > 0)
		{
			System.out.println(num+"	is Positive");
		}
		else if(num == 0)
		{
			System.out.println(num + "	is Zero ");
		}
		else{
			System.out.println(num+"	is Invalid ");
		}
	}
}