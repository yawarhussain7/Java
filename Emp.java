import java.util.Scanner;

class A{
	String name;
	int salary;
	int id;
	float total = 0;

	A(String name,int salary,int id)
	{
		this.name = name;
		this.id = id;
		this.salary = salary;

	}

	void increment()
	{
		if(this.salary < 10000)
		{
			total = (this.salary * 20)/100;
			this.salary += total;
		}
		else{
			total = (this.salary * 10)/100;
			this.salary += total;
		}
	}

	void display()
	{
		System.out.println(id+"\t"+name+"\t"+salary);
	}

}

class Emp{

	public static void main(String[] args)
	{
		A emp1 = new A("Yawar",12000,122);
		emp1.increment();
		emp1.display();

	}
}