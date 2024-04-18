import java.util.Scanner;
class array{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int[] number = new int[3];
        
        for(int i = 0 ;i < number.length;i++)
        {
            System.out.println("Enter a number ");
            number[i] = input.nextInt();
        }
    }
}