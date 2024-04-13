import java.util.Scanner;

class class_62{
	
	public static void main(String args[])
	{

		Scanner input = new Scanner(System.in);
		int num1,num2,opt=0;
		
		while(opt != 8)
		{
		System.out.println("Enter the first number : ");
		num1 = input.nextInt();
		System.out.println("Enter the second number : ");
		num2 = input.nextInt();

		System.out.println("[1] Press for Division " );
		System.out.println("[2] Press for Multiplication " );
		System.out.println("[3] Press for Addition " );
		System.out.println("[4] Press for Subtraction " );
		System.out.println("[5] Press for Exit " );
		System.out.println("Chooice... ");
		opt = input.nextInt();
		switch(opt)
		{
		case 1:
				System.out.println(num1 + " / "+ num2+" = "+ (num1 / num2));
				break;

			case 2:
				System.out.println(num1 + " * "+ num2+" = "+ (num1 * num2));
				break;
			case 3:
				System.out.println(num1 + " + "+ num2+" = "+ (num1 + num2));
				break;
				case 4:
				System.out.println(num1 + " - "+ num2+" = "+ (num1 - num2));
				break;
			default:
				System.out.println("INvlaid number ");
		}
		}
	}
}