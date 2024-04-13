class Actions{

	String name;
	int time;

	Actions(String name,int time )
	{
		this.name = name;
		this.time = time ;
	}
	
	void display()
	{
		System.out.println("Name : "+this.name+"\n"+"Feeding_Time : "+this.time);
	}
}

class Animals{

	public static void main(String args[])
	{
		Actions obj1 = new Actions("Dog",2);
		obj1.display();
		Actions obj2 = new Actions("Cat",3);
		obj2.display();
	}
}
