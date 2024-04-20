import java.util.Scanner;

class Class_91{

    static void copy(int array_01[], int array_02[])
    {
        for(int i = 0 ; i < array_01.length;i++)
        {
            array_02[i] = array_01[i];
        }
        System.out.println("Copy sucessfull...");
        System.out.println("Array_02");
        for(int i = 0; i < array_02.length;i++)
        {
            System.out.println(array_02[i]+" ");
        }
    }



    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        int range; 
        System.out.print("Enter the range of array :> ");
        range = input.nextInt();

        int numbers[] = new int[range];
        int number[]  = new int[range];
        for(int i = 0 ; i < numbers.length;i++)
        {
            System.out.print("Enter :> ");
            numbers[i] = input.nextInt();
        }

        System.out.println("Array_01");
        for(int i = 0 ; i <numbers.length;i++)
        {
            System.out.println(numbers[i]+" ");
        }
        
        Class_91.copy(numbers,number);


    }
}