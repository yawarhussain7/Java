import java.util.Scanner;

class Class_89{

    static void display(int arg[])
    {
        for(int i = 0 ; i < arg.length; i++)
        {
            System.out.print(arg[i]+" ");
        }
    }
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int range;
        System.out.print("Enter the range of array :> ");
        range = input.nextInt();
        int array[] = new int[range];

        for(int i= 0; i < array.length;i++)
        {
            System.out.print("Enter :> ");
            array[i] = input.nextInt();
        }

        Class_89.display(array);
        System.out.println();
        for(int i =( array.length - 1 ); i >=0 ;i--)
        {
            System.out.print(array[i]+" ");
        }
        
    }
}
