import java.util.Scanner;

class Class77{
	
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int num,sum=0,rem; 
		System.out.println("Enter the any number :> ");
		num = input.nextInt();

		while(num>0){
			rem = num %10;
			sum = sum + rem;
			num = num /10;
		}
		System.out.println("SUm : "+sum);
	}
}