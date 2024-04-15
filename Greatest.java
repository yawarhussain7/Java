import java.util.Scanner;
class Greatest{
	
	public static void main(String args[])
	{
		int num1,num2,num3;

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		num1 = input.nextInt();
		System.out.println("Enter the second number : ");
		num2 = input.nextInt();
		System.out.println("Enter the thrid number : ");
		num3 = input.nextInt();

		if(num1 > num2 && num1> num3)
		{
			System.out.println("Greatest number : "+num1);
		}
		else if(num2 > num1 && num2 > num3){
			System.out.println("Greatest number : "+num2);
		}
		else{
			System.out.println("Greatest number : "+num3);
		}

	}
}