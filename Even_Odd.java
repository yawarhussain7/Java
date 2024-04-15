import java.util.Scanner;
class Even_Odd{
	
	public static void main(String args[])
	{
		Scanner obj = new Scanner(System.in);

		int num;
		System.out.print("Enter a number : ");
		num = obj.nextInt();

		if(num % 2 == 0)
		{
			System.out.print(num + " is Even number");
		}
		else {
			System.out.print(num + " is Odd number");
		}
	}
}