import java.util.Scanner;

class Marks{
	
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int[] Marks = new int[5];
		int sum = 0;
		double avg;

		for(int i = 0; i < 5; i++)
		{
			System.out.println("Enter the marks of "+ i + " Subject : " );
			Marks[i]  =  input.nextInt();

			sum = sum + Marks[i];
		}	

		avg = sum/5.0;
		System.out.println("Total Marks : "+sum);
		System.out.println("Average : "+avg);
		System.out.println("Percent : "+(sum*100)/500+"%");

	}
}