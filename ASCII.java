import java.util.Scanner;

class ASCII{
	
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		char ch;
		System.out.println("Enter a Character : ");
		ch = input.next().charAt(0);
		System.out.println("ASCII value of "+ch +" is "+(int)ch);
	}	
}