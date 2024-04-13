import java.util.Scanner;

class Class79{

		public static void main(String args[])
		{
			Scanner input = new Scanner(System.in);
			int num,reverse=0,rem=0,temp;

			System.out.println("Enter your number :> ");
			num = input.nextInt();

			temp = num;

			while(num>0)
			{
				rem = num %10;
				reverse = (reverse*10) +rem;
				num = num/10;
			}

			

			if(temp == reverse)
			{
				System.out.println("Number is Palindrome");
			}
			else{
				System.out.println("Number is Not Palindrome");
			}
		}
}