import java.util.Scanner;

class Class_90
{
    public static void main(String args[])
    {
        Scanner  input = new Scanner(System.in);

        int range;
        System.out.print("Enter the array range :> ");
        range = input.nextInt();

        int array[] = new int[range];
        int size = 0;
        for(int i = 0; i < array.length; i++)
        {
            System.out.print("Enter :> ");
            array[i] = input.nextInt();
            size++;
        }
        for(int i = 0 ; i < array.length;i++)
        {
            System.out.println(array[i]+" ");
        }
        
        System.out.println("The size of array : "+size);
    }
}