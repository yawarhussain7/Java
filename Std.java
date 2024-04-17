import java.util.Scanner; 
class Management{ 
String name; 
String departement; 
String reg_no; 
String address; 
String[] courses = new String[5]; 
String dob; 
int id; 
void get() 
{ 
Scanner input = new Scanner(System.in); 
System.out.println("Enter the Student name : "); 
name = input.next(); 
System.out.println("Enter the Student Departement : "); 
departement = input.next(); 
System.out.println("Enter the Student Registration no : "); 
reg_no = input.next(); 
System.out.println("Enter the Student Address : "); 
address = input.next(); 
System.out.println("Enter the Student Date of Birth : "); 
dob = input.next(); 
System.out.println("Enter the Student id :"); 
id = input.nextInt(); 
for(int i = 0; i < courses.length; i++) 
{ 
   System.out.print("Enter the ["+i+"] name of Subject : "); 
   courses[i] = input.next(); 
  } 
} 
 void display() 
 { 
 
 System.out.println(id+"\t"+name+"\t"+departement+"\t"+reg_no+"\t"+dob+"\t"
 +address); 
  System.out.println(); 
  System.out.println("\t *********** < Courses > ***********"); 
  for(int i = 0; i < courses.length ;i++) 
  { 
   System.out.println(courses[i]+"\t"); 
  } 
  System.out.println(); 
 } 
} 
class Std{ 
 
 public static void main(String args[]) 
 { 
  Management[] mag = new Management[2]; 
 
  for (int i = 0; i < mag.length; i++) { 
    
   mag[i] = new Management(); 
   mag[i].get(); 
  } 
  System.out.println("ID \t Name \t Departement \t Registration_no \t Date_of_Birth \t Address"); 
 
  for (int i =0; i < mag.length; i++) { 
   mag[i].display(); 
System.out.println(); 
} 
} 
} 