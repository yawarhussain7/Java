import java.util.Scanner;

class class_59{
		
		public static void main(String argsp[])
		{
			Scanner input = new Scanner(System.in);

			int age ;
			System.out.println("Enter you age : ");
			age = input.nextInt();

			if(age > 18)
			{
				System.out.println("You are eligable for Voting ");
			}
			else 
			{
				System.out.println("You are Not Eligable for voting ");
			}
		}
}