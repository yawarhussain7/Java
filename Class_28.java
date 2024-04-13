// TOpic: Nested if-else 

import java.util.Scanner;

class Class_28{

	public static void main(String args[])
	{

		Scanner obj = new Scanner(System.in);
		int money;

		System.out.println("Enter you amount ");

		money = obj.nextInt();

		if(money > 1000)
		{
			if(money >= 5000 && money <= 10000)
			{
				System.out.println("You have : "+money+"$ Now you go with Neha ");
			}
			else if(money > 3000 && money < 5000)
			{
				System.out.println("You have : "+money+"$ Now you go with Radika ");
			}
			else if(money > 10000)
			{
				System.out.println("You have : "+money+"$ Now you go with Your Friends ");
			}
			else{
				System.out.println("You have : "+money+"$");
			}
		}
		else if(money < 1000)
		{
			System.out.print("You have "+money+"$");
		}
		else {
			System.out.println("Invalid Value");
		}
	}
}