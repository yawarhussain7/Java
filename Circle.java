import java.util.Scanner;
import java.lang.Math.*;
class Circle{
	
	public static void main(String args[])
	{
		double radius,area=0;

		Scanner input = new Scanner(System.in);
	
		System.out.println("Enter the radius of circle : ");
		radius = input.nextFloat();

		area = Math.PI *( radius *radius);
		System.out.println("Area is : "+area);
	}
}