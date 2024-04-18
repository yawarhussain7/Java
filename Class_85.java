import java.util.Scanner;

class Class_85{

    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int size;
        System.out.print("Enter size of array :> ");
        size = input.nextInt();
        int arrya[] = new int[size];
        for(int i = 0 ;i <arrya.length;i++)
        {
            System.out.print("Enter the Element of array :> ");
            arrya[i] = input.nextInt();
        }

        for(int i = 0 ;i < arrya.length;i++)
        {
            System.out.println(arrya[i]);
        }
    }
}