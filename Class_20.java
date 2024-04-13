import java.util.Scanner;

class Class_20{
	
	public static void main(String args[])
	{
		Scanner obj = new Scanner(System.in);
		int a ;
		int b;

		System.out.println("Enter the value of a : ");
		a = obj.nextInt();

		System.out.println("Enter the value of B : ");
		b = obj.nextInt();

		System.out.println("<<<=== Arthmetic Operators ===>>>\n");
		System.out.println(a+" + "+ b +" = "+(a + b));
		System.out.println(a+" - "+ b +" = "+(a - b));
		System.out.println(a+" x "+ b +" = "+(a * b));
		System.out.println(a+" / "+ b +" = "+(a / b));

		System.out.println("<<<=== Relational Operators ===>>>\n");
		System.out.println(a+" > "+ b +" = "+(a > b));
		System.out.println(a+" < "+ b +" = "+(a < b));
		System.out.println(a+" >= "+ b +" = "+(a >= b));
		System.out.println(a+" <= "+ b +" = "+(a <= b));
		System.out.println(a+" != "+ b +" = "+(a != b));
		System.out.println(a+" == "+ b +" = "+(a == b));

		
	}	
}