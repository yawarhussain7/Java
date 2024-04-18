import java.util.Scanner;

class Class_84{

    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int start,end,i,j;
        System.out.print("Enter your Starting number :> ");
        start = input.nextInt();
        System.out.print("\nEnter your Ending number :> ");
        end = input.nextInt();

        for(i = start; i <= end;i++)
        {
            for( j = 2; j <= i;j++)
            {
                if(i % j ==0)
                {
                    break;
                }
            }
            if(i == j )
            {
                System.out.println(j+" ");
            }
        

        }
    }   
}