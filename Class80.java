import java.util.Scanner;

class Class80{
	
		public static void main(String args[])
		{
			Scanner input = new Scanner(System.in);
			int num,rem=0,pow=0,temp=0;
			double prod=0;
			System.out.print("Enter your number :> ");
			num = input.nextInt();
			temp = num;

			int check_num,check_rem=0;
			check_num = num;

			while(check_num >0)
			{
				check_rem = check_num %10;
				pow++;
				check_num = check_num /10;
			}
			System.out.println("Your Power is : "+pow);

			while(num > 0)
			{
					rem = num %10;
					prod = prod + (Math.pow(rem,pow));
					num = num /10;
			}

			if(prod == temp)
			{
				System.out.print(temp+"	is Armstrong ");
			}
			else{
				System.out.println(temp+"	is Not Armstrong ");
			}
		}
}