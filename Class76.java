import java.util.Scanner;

class Class76{
	
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int num,rem=0;
		System.out.print("Enter your number :> ");
		num = input.nextInt();

		System.out.println("You number is : "+num);
		while(num>0)
		{
			rem = num % 10;
			System.out.print(rem+" ");
			num = num / 10;
		}
		
		
	}
}