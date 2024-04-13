// topic : Conditinal Operator 

import java.util.Scanner;

class Class_26{

	public static void main(String args[])
	{
		Scanner obj = new Scanner(System.in);

		int age; 

		System.out.print("Enter your age : ");
		age = obj.nextInt();

		if(age >= 0 && age <= 10)
		{
			System.out.println("You age is between 0-10 ");
		}
		else if(age > 10 && age <= 40)
		{
			System.out.println("Your age is Greater then 10 and Less then 41 ");
		}
		else 
		{
			System.out.println("Your age is Not between 0-10");
		}
	}
}