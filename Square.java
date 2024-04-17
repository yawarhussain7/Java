import java.util.Scanner;

class Square{
	
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);

		float side_01,side_02,side_03,side_04,result;
		System.out.println("Enter the value of side 01 : ");
		side_01 = input.nextFloat();
		System.out.println("Enter the value of side 02 : ");
		side_02 = input.nextFloat();
		System.out.println("Enter the value of side 03 : ");
		side_03 = input.nextFloat();
		System.out.println("Enter the value of side 04 : ");
		side_04 = input.nextFloat();

		if(side_01 == side_02 && side_02 == side_03 && side_03 == side_04)
		{
			result = side_01 + side_02 + side_03+side_04;
			System.out.println("Result : "+result);
		}
		else{
			System.out.println("Sides Not Match ");
		}
	}
}