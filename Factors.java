import java.util.Scanner;

class Factors{
	
	public static void main(String args[])
	{
		 Scanner input = new Scanner(System.in);
		 int num;
		 System.out.println("Enter the number :> ");
		 num = input.nextInt();

		 for(int i= 1; i <= num ;i++)
		 {
		 	if(num%i == 0)
		 	{
		 		System.out.print(i+" ");
		 	}
		 }
	}
}