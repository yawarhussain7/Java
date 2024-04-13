
public class Class_11 {

    /**
     * THere are three types of variable in Java 
     * 1.   Local Variable       which are use inside of the method or Function 
     * 2.   Static Variable     which are decleared with help of static keyword
     * 3.   Instance Variable   which are use outside of the method or Function but inside the class 
     */
    
    static int Static_var = 23;
    int instance = 56;
    public static void main(String args[]) {
        int Local_var = 43;
       System.out.println("Variable Types in Java ");
       
       Class_11 ref=new Class_11();
       
       System.out.println("Local Variable "+Local_var);
       System.out.println("Instance Variable " + ref.instance);
       System.out.println("Static Variable "+ Class_11.Static_var);
    }
}
