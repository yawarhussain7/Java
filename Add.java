import java.util.Scanner;
class Add{
	
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);

		int num1,num2;
		System.out.print("Enter a num1 : ");
		num1 = input.nextInt();
		System.out.print("Enter a num2 : ");
		num2 = input.nextInt();
		System.out.print(num1 + " + "+ num2 + " = "+ (num1 + num2));
	}
}