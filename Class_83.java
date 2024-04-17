import java.util.Scanner;

class Class_83{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        int num ,sum = 0;
        System.out.print("Enter your number :> ");
        num = input.nextInt();

        for(int i = 1; i <= num/2; i++)
        {
            if(num % i == 0)
            {
            sum = sum +i;
            }
            else{
                continue;
            }
        }   

        if(sum == num){
            System.out.println(num +"   is Perfect number ");
        }
        else{
            System.out.println(num+"    is Not Perfect number ");
        }
    }
}