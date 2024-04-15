//TOpic FOr loop

import java.util.Scanner;

class for_loop{
	
	public static void main(String args[])
	{
		Scanner obj =new Scanner(System.in);

		System.out.println("Enter the number ");
		int num = obj.nextInt();

		for(int i = 1; i <= 10; i++)
		{
			System.out.println(num + " x "+ i+" = "+ (num*i));
		}

	}
}