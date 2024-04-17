import java.util.Scanner;

class inventory{
    char Zone;
    int id;
    String kind;
    float weight;
    float height;
    int quantity;
    int price;

    void Display()
    {
        System.out.println("ID\tZone\t Kind\tWeight\tHeight\tQuantity\tPrice");
        System.out.println(id+"\t"+Zone+"\t"+kind+"\t"+weight+"\t"+height+"\t"+quantity+"\t"+price);
    }

    void ADD(inventory[] obj)
    {

        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter Timber ZOne :> ");
        Zone = input.next().charAt(0);
        System.out.print("\nEnter Timber ID :> ");
        id = input.nextInt();
        System.out.print("\nEnter Timber KIND :> ");
        kind = input.next();
        System.out.print("\nEnter Timber WEIGHT :> ");
        weight = input.nextFloat();
        System.out.print("\nEnter Timber HEIGHT :> ");
        height = input.nextFloat();
        System.out.print("\nEnter Timber QUANTITY :> ");
        quantity = input.nextInt();
        System.out.print("\nEnter Timber PRICE :> ");
        price = input.nextInt();

        for(int i = 0; i < obj.length;i++)
        {
 
             if(id == obj[i].id)
            {
                System.out.println("Error: ID is reuse ! ");
                break;
            }

            
          
        }
    }

    

    void Zone_record(inventory[] obj)
    {
        Scanner input = new Scanner(System.in);
     char Z;
     System.out.print("Enter the searching zone :> ");
     Z = input.next().charAt(0);
      
      for(int i = 0; i < obj.length ;i++)
      {
        if(Z == obj[i].Zone)
        {
            System.out.println("Found....");
            obj[i].Display();
            break;

        }
        else{
            continue;
        }

      }
          
    }

    void kind_record(inventory[] obj)
    {
        Scanner input = new Scanner(System.in);
        String S;
        System.out.print("\nEnter you Kind of Timber :> ");
        S = input.next();

        for(int i = 0; i < obj.length;i++)
        {
            if(S.equals(obj[i].kind) )
            {
                obj[i].Display();
            }
            else{
                continue;
            }
        }
    }
}

class Timber{

    public static void main(String args[])
    {
            Scanner input = new Scanner(System.in);
            int item,choice=0;
            System.out.print("Enter the number of Tress :> ");
            item = input.nextInt();

            inventory[] obj = new inventory[item];



            while(choice !=8)
            {
                System.out.print("\n[1] Add a new Timber records :> ");
                System.out.print("\n[2] Display all records for a given Zone :> ");
                System.out.print("\n[3] Display a particular record given the Kind :> ");
                System.out.print("\n[4] Analysis of record level :> ");
                System.out.print("\n[5] Sales update Report :> ");
                System.out.print("\n[6] Delete a particular Timber record :> ");
                System.out.print("\n[7] Update a particular Timber record :> ");
                System.out.print("\n[8] Exit");
                System.out.print("\nChoice...");
                choice = input.nextInt();

                switch(choice)
                {
                    case 1:
                        System.out.println("<<<<<<<<< ADD RECORDS >>>>>>>>>");
                        for(int i = 0; i <obj.length; i++)
                        {
                            obj[i] = new inventory();
                            obj[i].ADD(obj);
                        }
                        break;
                        
                        case 2:
                            System.out.println("<<<<<<<<< ZONE RECORDS >>>>>>>>>");

                            for(int i = 0 ; i < obj.length;i++)
                            {
                                obj[i].Zone_record(obj);
                            }
                            break;
                            
                            case 3:
                                System.out.println("<<<<<<<<< KIND RECORDS >>>>>>>>>>");

                                for(int i = 0; i < obj.length;i++)
                                {
                                    obj[i].kind_record(obj);
                                }
                                break;

                                case 4:
                                    System.out.println("<<<<<<<<< ANALYSIS RECORDS >>>>>>>>>>>");
                                    break;
                                
                                    case 5:
                                        System.out.println("<<<<<<<<< SALES UPDATE >>>>>>>>>>>");
                                        break;

                                        case 6:
                                            System.out.println("<<<<<<<<< DELETE RECORDS >>>>>>>>>>");
                                            break;

                                            case 7:
                                                System.out.println("<<<<<<<<<<< UPDATE RECORDS >>>>>>>>>");
                                                break;

                                                case 8:
                                                    System.out.println("<<<<<<<<< EXIT >>>>>>>>>>");
                                                    break;
                                                    
                                                    default:
                                                        System.out.println("Error:> Invalid number ");
                }
            }
    }
}