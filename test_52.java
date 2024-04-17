import java.util.Scanner;

class test_52{

	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);

		int num; 
		System.out.println("Enter a number : ");
		num = input.nextInt();

		for(int i = 1; i <= num; i++)
		{
			if(i % 2 != 0)
			{
				System.out.print(i +" ");
			}
			else{
				continue;
			}
		}
	}
}