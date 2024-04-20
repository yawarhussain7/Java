import java.util.Scanner;

class Class_94{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        
        int sum = 0,range;
        float avg=0;

        System.out.print("Enter the range of array :> ");
        range = input.nextInt();

        int[] array = new int[range];

        for(int i = 0; i < array.length;i++)
        {
            System.out.print("Enter :> ");
            array[i] = input.nextInt();
        }

        for(int i= 0;i <array.length;i++)
        {
            sum = sum + array[i];
            System.out.print(array[i]+" ");
        }
        avg = sum/array.length;

        System.out.println("Average => "+avg);

    }
}