import java.util.Scanner;

class test_50{

	public static void main(String arg[])
	{
		Scanner input = new Scanner(System.in);

		int num,sum = 0;
		System.out.println("Enter a term of number : ");
		num = input.nextInt();
		for(int i = 0; i <= num;i++)
		{
			sum += i;
		}
		System.out.println("Sum is : "+sum);
	}
}