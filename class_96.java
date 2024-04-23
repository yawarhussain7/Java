import java.util.Scanner;
import java.util.Arrays;


class class_96{

    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        int range;
        System.out.print("Enter the range of array :> ");
        range = input.nextInt();

        int[] num = new int[range];

        int[] num1 = new int[range];
        //Get the num  values 
        for(int i = 0; i<num.length;i++)
        {
            System.out.print("\nEnter num :> ");
            num[i] = input.nextInt();
        }
        //get the num1 values 
        for(int i = 0; i<num.length;i++)
        {
            System.out.print("\nEnter num1 :> ");
            num1[i] = input.nextInt();
        }
        // Build in function 
        Arrays.sort(num);
      
        for(int i = 0 ;i < num.length;i++)
        {
            System.out.print(num[i]+" ");
        }

        //compresion between num1 array and num array
       boolean b = Arrays.equals(num1,num);

       System.out.println("\nEqual functionN :> "+b); 

    //    copy num1 array value into num2 array 
       int[] num2 = Arrays.copyOf(num1,range);

       System.out.println("<<<<<<< Num2 >>>>>>>>");
       for(int i= 0; i < num2.length;i++)
       {
        System.out.print(num2[i]+" ");
       }
    }
}