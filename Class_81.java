import java.util.Scanner;

class Class_81{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("Enter your number :> ");
        num = input.nextInt();

        for(int i = 0;i < num/2;i++)
        {
            if(i*i == num)
            {
                System.out.print(i+" ");
            }
            else{
                continue;
            }
        }
    }
}