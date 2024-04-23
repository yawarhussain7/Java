import java.util.Scanner;

class class_100{

    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        int range ;
        System.out.print("Enter the range of array :> ");
        range = input.nextInt();

        int[] num  = new int[range];

        for(int i =0 ;i < num.length;i++)
        {
            System.out.print("Enter the index "+i+" :> ");
            num[i] = input.nextInt();
        }
        
        for(int i = 0; i < num.length; i++)
        {
            for(int j = i+1; j<num.length; j++)
            {
                
                if(num[i] > num[j])
                {
                    int temp = num[j];
                    num[j] = num[i];
                    num[i] = temp;
                }
            }
        }
        System.out.println("After");
        for(int i = 0; i <num.length; i++){
            System.out.print(num[i]+"  ");
        }
    }
}