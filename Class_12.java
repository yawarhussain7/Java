
public class Class_12 {

    static int num1 = 10;   // It use single meemory and life time is end of the progarm 
    
    void fun()
    {
        int num2 = 10;
        System.out.println("Static Variable : "+num1 +"\n Local Varible : " + num2);
        num1++;
        num2++;
    }

    public static void main(String args[]) {
        
        Class_12 ref = new Class_12();
        
       ref.fun();
       System.out.println();
       ref.fun();
    }
}
