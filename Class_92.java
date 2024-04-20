import java.util.Scanner;

class Class_92{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        int range,sum=0;
        System.out.print("Enter the range of array :> ");
        range = input.nextInt();

        int array[] = new int[range];

        for(int i = 0; i < array.length;i++)
        {
            System.out.print("Enter :> ");
            array[i] = input.nextInt();

            sum = sum + array[i];
        }

        for(int i =0; i < array.length;i++)
    {
            System.out.print(array[i]+" ");
    }

        System.out.println("Sum => "+sum);
    }
}