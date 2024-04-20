import java.util.Scanner;

class Class_93{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int range,num=0;
        System.out.print("Enter the range of array :> ");
        range = input.nextInt();

        int array[] = new int[range];

        for(int i = 0 ; i < array.length;i++)
        {
            System.out.print("Enter :> ");
            array[i] = input.nextInt();
        }

        for(int i= 0;i < array.length; i++)
        {
            System.out.print(array[i]+" ");
        }

        System.out.print("Enter the searching number :> ");
        num = input.nextInt();

        for(int i = 0; i <array.length;i++)
        {
            if(num == array[i])
            {
                System.out.println("Number found !\n"+num);
                
                break;
            }
            else{
                continue;
            }
        }

        

    }
}