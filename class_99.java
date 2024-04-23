import java.util.Scanner;
class class_99{

    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        int range ;
        System.out.print("Enter the range of array :> ");
        range = input.nextInt();

        int[]  num = new int[range];

        for(int i = 0; i < num.length;i++)
        {
            System.out.print("Enter the index "+i+" :> ");
            num[i] = input.nextInt();
        }

        int min  = num[0];
        for(int i = 1; i<num.length;i++)
        {
            if(min > num[i])
            {
                min = num[i];
            }
        }

        for(int i = 0; i < num.length;i++)
        {
            System.out.print("\n"+ num[i]+" ");
        }
        System.out.println("Minimum number :> "+min);
    }
}