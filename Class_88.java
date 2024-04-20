// toString() asList() deeptoString
import java.util.Arrays;

 class Class_88 {
    
    public static void main(String args[])
    {
        String a[] = {"Yawar","Hussain","Siraj","Muhammad","Shoaib"};
        
        // Use for single line arrray 
        System.out.println("toString() :> "+Arrays.toString(a));
        System.out.println("toList() :> "+Arrays.asList(a));
        // Multi dimensional array 
        int num[][] ={{10,20},{30,40},{50,60},{70,80}};
        System.out.println("DeeptoString() :> "+Arrays.deepToString(num));
    }

}
