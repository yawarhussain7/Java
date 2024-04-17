import java.util.Scanner;

class Power{
	
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);

		int num; 
		int power;
		System.out.println("Enter the number : ");
		num = input.nextInt();
		System.out.println("Enter the power of number : ");
		power = input.nextInt();

		int result = 1;
		for (int i = 1; i <= power; i++) {
			result = result*num;
			}
	System.out.println("Result = "+result);
	}
}