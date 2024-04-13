// TOpic: Switch Statement 

import java.util.Scanner;

class Class_29{

	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);

		int num1,num2,chooice;

		System.out.println("Enter the first number : ");
		num1 = obj.nextInt();
		System.out.println("Enter the second number : ");
		num2 = obj.nextInt();

		System.out.println("1 => Press for Division ");
		System.out.println("2 => Press for Multiplication ");
		System.out.println("3 => Press for Addition ");
		System.out.println("4 => Press for Subtraction ");

		System.out.print("Chooice....");
		chooice = obj.nextInt();

		switch (chooice) {
			case 1:
				System.out.println(num1 + " / "+ num2 +" = "+ (num1 / num2));
				break;
			case 2:
				System.out.println(num1 + " x "+ num2 +" = "+ (num1 * num2));
				break;
			case 3:
				System.out.println(num1 + " + "+ num2 +" = "+ (num1 + num2));
				break;
			case 4:
				System.out.println(num1 + " - "+ num2 +" = "+ (num1 - num2));
				break;
			default:
				System.out.println("Invalid Chooice !");
		}

	}
}