import java.util.Scanner;

class Three{
	
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int num1,num2,num3;
		System.out.println("Enter the first number : ");
		num1 = input.nextInt();
		System.out.println("Enter the second number : ");
		num2 = input.nextInt();
		System.out.println("Enter the third number : ");
		num3 = input.nextInt();

		int result = (num1 > num2 )? (num1 > num3 ? num1:num3) :(num2 > num3 ? num2:num3);
		System.out.println("Result = "+result);
	}
}