import java.util.Scanner;
class Nature{
	
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);

		int num ; 
		System.out.print("Enter the range of Natural Number : ");
		num = input.nextInt();

		for(int i = 1; i <= num; i++)
		{
			System.out.print(i+" ");
		}
	}
}