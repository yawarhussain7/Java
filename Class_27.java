// Topic: If-else else-if statement 
import java.util.Scanner;

class Class_27{

	public static void main(String args[])
	{
		Scanner obj =new Scanner(System.in);

		int marks ;
		System.out.println("Enter your mark : ");
		marks = obj.nextInt();

		if(marks >=90 && marks <= 100)
		{
			System.out.println("Your Grade is A+ ");
		}
		else if(marks >=80 && marks < 90)
		{
			System.out.println("Your Grade is A ");
		}
		else if(marks >= 70 && marks <79)
		{
			System.out.println("Your Grade is B ");
		}
		else if(marks >= 60 && marks < 69)
		{
			System.out.println("Your Grade is C ");
		}
		else if(marks >= 50 && marks < 59)
		{
			System.out.println("YOur Grade is E ");
		}
		else if(marks <= 49)
		{
			System.out.println("Your Grade is F ");
		}
		else{
			System.out.println("Sorry we have Issue ");
		}
	}
}