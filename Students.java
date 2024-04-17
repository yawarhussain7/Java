import java.util.Scanner;

class info{
	int id ; 
	String name;
	String reg;
	int[] marks = new int[3];

	void gets()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Student ID : ");
		id = input.nextInt();
		System.out.println("Enter the Student Name : ");
		name = input.next();
		System.out.println("Enter the Student Registration no : ");
		reg = input.next();

		for(int i = 0; i < 3; i++)
		{
			System.out.println("Enter the Marks of Subject : "+i+" => ");
			marks[i] = input.nextInt();
		}
	}
	
	void display()
	{
		System.out.println(id+"\t"+name+"\t"+reg+"\t");
		for(int i = 0; i<3; i++)
		{
			System.out.println("subject"+i+" Marks is : "+marks[i]);
		}
	}
}

class Students{

public static void main(String args[])
{
	info[] std = new info[3];
	
	for(int i = 0; i < 3; i++)
	{
		std[i] = new info();
	std[i].gets();
	
	}
	System.out.println("ID\t Name \t Registration no ");
		
	for(int i = 0 ; i < 3 ; i++)
	{
		std[i].display();
	}
}

}