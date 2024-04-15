import java.util.Scanner;

class test{
	int emp_code;
	String emp_name;
	double date_of_joining;
	

	void get()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Employee ID : ");
		emp_code = input.nextInt();
		System.out.println("Enter the Employee name : ");
		emp_name = input.next();
		System.out.println("Enter the date of Joining : ");
		date_of_joining = input.nextFloat();

	}

	void current()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the current date : ");
		current = input.nextFloat();

		double check = current - date_of_joining;

		if(check >=3 )
		{
			System.out.println("Employee Joining is More then 3 years");
		}
		else{
			System.out.println("Employee Joining is NOT 3 years");
		}
	}

}

class employee{

	public static void main(String args[])
	{
		test obj1 = new test();
		obj1.get();
		obj1.current();

		test obj2 = new test();
		obj2.get();
		obj2.current();
	}
}