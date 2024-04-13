//TOpic : Logical Operator
import java.util.Scanner;

class Class_22{

	public static void main(String args[])
	{
		Scanner obj = new Scanner(System.in);

		int age; 
		System.out.println("Enter your age : ");
		age = obj.nextInt();

		if(age >=0 && age <= 10)
		{
			System.out.println("Your a kid : You cannot come to party ");
		}
		else if(age > 10 && age <= 20)
		{
			System.out.print("You are Young : You can come my party using Kid pass");
		}
		else if(age > 20 )
		{
			System.out.print("Welcome to my party it is very pleasure to meet you ");
		}

		else if(age >= -1)
		{
			System.out.println("Invalid number");
		}

		else{
			System.out.print("Program Terminate ")
		}

	}
}