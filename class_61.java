import java.util.Scanner;

class class_61{
	
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		float tax=0,salary;

		System.out.println("Enter you salary : ");
		salary = input.nextFloat();


		if(salary > 1 && salary <= 10000 )
		{
			System.out.println("Salary is : $"+salary);
			System.out.println("Tax is : $"+tax);
		}
		else if(salary > 10000 && salary <= 100000)
		{

			tax = (salary * 10) / 100;	
			salary = salary - tax;
			
			System.out.println("Tax is : $"+tax);
			System.out.println("Salary is : $"+salary);
		}
			else if(salary > 100000)
		{

			tax = (salary * 20) / 100;	
			salary = salary - tax;
			
			System.out.println("Tax is : $"+tax);
			System.out.println("Salary is : $"+salary);
		}
		else{
			System.out.println("Invalid number ");
		}

	}
}