// Topic: While-loops

import java.util.Scanner;

class Class_30{

	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);

		int num;
		System.out.println("Enter a number : ");
		num = obj.nextInt();

		// while(num >= 1)
		// {
		// 	System.out.println("Transfering... "+num+"%");
		// 	--num;
		// }
		int  i = 1;
		while(i <=10)
		{
			System.out.println(num+" x "+i+" = "+(num*i));
			i++;
		}


	}
}