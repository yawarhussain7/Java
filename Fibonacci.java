class Fibonacci{
 
    public static void main(String[] args)
    {
        int first = 1;
        int second = 1;
        int next = 0;
        int num = 7;
        
        if(num == 1 || num == 2)
        {
            System.out.println("Fibonacci of "+num +" = " + first);
        }
        else
        {
            for(int i = num ; i>2;i--)
            {
                next = first + second ;
                first = second ;
                second = next;
            }
            
            System.out.println("Fiboncci of "+ num +" = " + second);
        }
            
    }
    
}