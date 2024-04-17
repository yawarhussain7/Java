import java.util.Scanner;

class test_51{

	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int num1;
		System.out.println("Enter the number : ");
		num1 = input.nextInt();
		for(int i = 1; i <= num1 ; i++)
		{
			if(i %2 == 0)
			{
				
				System.out.print(i +" ");
			}
			else{
				continue;
			}
		}
	}
}