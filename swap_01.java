import java.util.Scanner
class swap_01{
	
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int num1,num2;

		System.out.println("Enter the first number : ");
		num1 = input.nextInt();
		System.out.println("Enter the second number : ");
		num2 = input.nextInt();

		System.out.println("***********( Before Swap )***********");
		System.out.println("num1 = "+num1);
		System.out.println("num2 = "+num2);

		num1 = num1+num2;
		num2 = num1-num2;
		num1 = num1 -num2;

		System.out.println("***********( After Swap )***********");
		System.out.println("num1 = "+num1);
		System.out.println("num2 = "+num2);
	}
}