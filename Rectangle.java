import java.util.Scanner;

class Rectangle{
	
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);

		float length,width,area;
		System.out.println("Enter the length of Rectangle : ");
		length = input.nextFloat();
		System.out.println("Enter the width of Rectangle : ");
		width = input.nextFloat();

		area = length * width;
		System.out.println("Area is : "+area);
		
	}

}