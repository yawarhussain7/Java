import java.util.Scanner;

class Class73{
	
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int num;
		System.out.println("Enter your number :> ");
		num = input.nextInt();

		if(num % 5 == 0)
		{
			System.out.println(num +"	is Divisible by 5");
		}
		else{
			System.out.println(num+"	is Not Divisible by 5");
		}
	}
}