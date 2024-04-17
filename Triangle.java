import java.util.Scanner;
import java.lang.Math;

class Triangle{
	
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		int side_01,side_02,side_03;
		double area=0,semi_parameter=0;

		System.out.println("Enter the side_01 value : ");
		side_01 = input.nextInt();
		System.out.println("Enter the side_02 value : ");
		side_02 = input.nextInt();
		System.out.println("Enter the side_03 value : ");
		side_03 = input.nextInt();

		semi_parameter = (side_01+side_02+side_03)/2.0;

		area = Math.sqrt(semi_parameter*(semi_parameter - side_01)*(semi_parameter - side_02)*(semi_parameter - side_03));

		System.out.println("Semi_Parameter : "+semi_parameter);
		System.out.printf("Area : %.0f",area);

	}
}