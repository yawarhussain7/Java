import java.util.Scanner;

class Class_95{

    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        int range;
        System.out.print("Enter the range of array :> ");
        range = input.nextInt();

        int []array = new int[range];

        for(int i = 0; i < array.length;i++)
        {
            System.out.print("Enter :> ");
            array[i] = input.nextInt();
        }

        System.out.println("<<<<<<<<< BEFORE >>>>>>>>>>>");
        for(int i = 0; i < array.length;i++)
        {
            System.out.print(array[i]+" ");
        }

        System.out.println();

        int max = 0;
        for(int i = 0; i< array.length;i++)
        {
         
         for(int j = i +1 ; j < array.length;j++)
         {
            if(array[i] < array[j])
            {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
         } 
          
        }


        System.out.println("<<<<<<<<< AFTER >>>>>>>>>>>");
        for(int i = 0; i < array.length;i++)
        {
            System.out.print(array[i]+" ");
        }

   

    }
}