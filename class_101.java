import java.util.Scanner;

class class_101{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        int size,loc,num;

        System.out.print("Enter the size of array :> ");
        size = input.nextInt();

        int[] nums= new int[size+1];

        for(int i = 0 ;i < size;i++)
        {
            System.out.print("Enter the index "+i+" :> ");
            nums[i] =  input.nextInt();
        }

        System.out.print("\n BEfore");
        for(int i = 0 ;i < nums.length;i++)
        {
            System.out.print(nums[i]+" ");
        }
        
        System.out.print("\nEnter the value of num :> ");
        num = input.nextInt();

        System.out.print("\nEnter the location of array :> ");
        loc = input.nextInt();

        for(int i = size ;i >loc;i--)
        {
            nums[i] = nums[i - 1];
        }
        nums[loc] = num;
        size++;
        
        System.out.print("\n After\n");
        for(int i = 0 ;i < nums.length;i++)
        {
            System.out.print(nums[i]+" ");
        }
        
    }
}