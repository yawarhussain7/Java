import java.util.Scanner;

class test_53{

	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);

		int num,even =0,odd = 0;
		System.out.println("Enter the term of number : ");
		num = input.nextInt();

		for(int i = 1; i <= num ; i++)
		{
			if(i %2 == 0)
			{
				even = even +  i;
				System.out.print(i+" ");
			}
		
		}
		System.out.println();
			System.out.println("Sum of Even : "+even);
			for(int i = 1; i <= num ; i++)
		{
		
			if(i % 2 != 0){
				odd = odd + i;
				System.out.print(i+" ");
			}
		}
		System.out.println();
	
		System.out.println("Sum of Odd : "+odd);
	}
}