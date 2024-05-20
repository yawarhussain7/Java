import java.io.*;

class Main_01{
    public static void main(String args[])

    throws IOException      // It is also manage exceptions

    {
       try{
        File files = new File("D:\\Program ZOne\\Java\\File Handing\\Main_01.txt");

        if(files.createNewFile())
        {
            System.out.println("File Created successfully ... ");
        }
        else{
            System.out.println("File is ALready Exist...");
        }
       }
       catch(IOException Exceptions)
       {
        System.out.println("Exception Error :> "+Exceptions);
       }
    }
}