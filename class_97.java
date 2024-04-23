import java.util.Arrays;
class class_97{
    public static void main(String args[])
    {
        int num[] = {1,2,3,4,5};
        int num1[] = {1,2,3,4,5};

        // num == num1  compare the reference variable

        if(Arrays.equals(num1,num))
        {
            System.out.println("Both array is Equal ");
        }
        else{
            System.out.println("Both array is Not Equal ");
        }
    }
}