import java.util.Scanner;

class Class_82{
    public static void main(String args[])
    {
        Scanner input =new Scanner(System.in);

        int num ;
        System.out.print("Enter your number :> ");
        num = input.nextInt();

        int counter = 0;
        for(int i = 1; i<=num;i++)
        {
            if(num % i == 0)
            {
                System.out.print(i+" ");
                counter++;
            }
            else{
                continue;
            }
        }

        if(counter == 2)
        {
            System.out.println("Prime Number ");
        }
        else
        {
            System.out.println("Not a Prime Number ");
        }
    }
}