import java.util.Scanner;
class Car{
	String CarModel;
	String CarName;
	int CarPrice;
	String CarOwner;

	void get()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the  CarModel : ");
		CarModel = input.next();
		System.out.println("Enter the Car Name : ");
		CarName = input.next();
		System.out.println("Enter the Price of Car : ");
		CarPrice = input.nextInt();
		System.out.println("Enter the Car Owner Name : ");
		CarOwner = input.next();
	}

	void display()
	{
		System.out.println(CarModel+"\t"+CarName+"\t"+CarPrice+"\t"+CarOwner);
	}

	void max(Car[] car)
	{
		int max = 0;
		for (int i= 0 ; i < car.length; i++) {

			if( max < car[i].CarPrice)
			{
				max = car[i].CarPrice;
			}

		}
		System.out.println("Max Price is : "+max);
	}

}

class Cars{

	public static void main(String args[])
	{
		Car[] car = new Car[3];

		for(int i = 0 ; i <car.length; i++)
		{
			car[i] = new Car();
			car[i].get();

		}

		for(int i = 0 ; i < car.length;i++)
		{
			car[i].display();
		}

		car[0].max(car);
		
	}
}