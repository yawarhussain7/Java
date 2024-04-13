import java.util.Scanner;
class Class_17{
	
	public static void main(String arg[])
	{

		Scanner obj = new Scanner(System.in);

		int a = 10;
		int b ;
		System.out.println("Enter a number ");
		b = obj.nextInt();

		int c = a +b;
		System.out.println("a = "+ a+"\n b = "+b+"\n sum = "+(a + b));
	}
}