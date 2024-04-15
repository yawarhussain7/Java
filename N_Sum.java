import java.util.Scanner;
class N_Sum{
	
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int sum = 0,num;
		System.out.print("Enter a range of number : ");
		num = input.nextInt();

		for(int i = 1; i <= num; i++)
		{
			sum += i;

		}
		System.out.println("Sum of "+num+" is : "+sum);
	}
}