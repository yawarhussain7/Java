import java.util.Scanner;

class class_98{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        
        int range;
        System.out.print("Enter the range of array :> ");
        range = input.nextInt();

        int[] num = new int[range];


        for(int i= 0;i <num.length;i++)
        {
            System.out.print("Enter the index "+i+" :> ");
            num[i] = input.nextInt();
        }

        int max = 0;

        for(int i = 0; i < num.length;i++)
        {
            if(max < num[i])
            {
                max = num[i];
            }

        }

        for(int i = 0 ; i < num.length;i++)
        {
            System.out.print(num[i]+" ");
        }
        System.out.println("\nMax value is :> "+max);
    }
}