/* W.A.P that accepts a shopping list of items and perform the following operations

   1) Add an item at a specified location
   2) Delete an item from the list
   3) Print the contents of the vector
*/
 
 package yogesh;
 
 import java.util.*;
 
 class Shopping
 {
  public static void main(String args[]) 
  {
   Scanner sc = new Scanner (System.in);
   String str;
   Vector v = new Vector();
   int i,choice=0,n;
   
   System.out.print("Enter no of shopping items to be stored");
   n=sc.nextInt();
   
   for(i=0;i<n;i++)
   {
      System.out.print("Enter item name ");
      str=sc.next();
      v.addElement(str);
   }
   while(choice!=5)
   {
     System.out.println("1.Add new item\n2.Delete item\n3.Display item\n4.Display Vector\n5.Exit\nEnter 	your choice:");
     choice=sc.nextInt();
     switch(choice)
     {
        case 1: System.out.print("Enter item name ");
                str=sc.next();
                v.addElement(str);
                break;
        case 2: System.out.print("Enter item name to be removed ");
                str=sc.next();
                v.removeElement(str);
                break;
        case 3: System.out.print("Enter index for which itemname to be displayed ");
                i=sc.nextInt();
                System.out.println("Name:"+v.elementAt(i));
                break;
	    case 4: System.out.println("Current List ");
                for(i=0;i<=v.size()-1;i++)
                {
                  System.out.println(v.elementAt(i));
                }                		
        case 5: 
                break;
        default: 
                System.out.println("Invalid choice");
      }
      
   }
 }
}
