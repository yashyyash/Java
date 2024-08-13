/* W.A.P that uses Vector class to add n names of students 
   initially.

   Display a menu :
   1) Add new name 
   2) Delete name  
   3) Display name
   4) Display the Vector using iterator statement.
*/   
 
 package yogesh;

 import java.util.*;

  class Student1
  {
   public static void main(String args[])  
   {
    Scanner sc = new Scanner(System.in);
    String str;
    Vector v=new Vector(); //This constructor creates a default vector, which has an initial size of 10.
    int i,choice=0,n;
	
    System.out.print("Enter no of students names to be stored ");
    n=sc.nextInt();
    
    for(i=0;i<n;i++)
    {
      System.out.print("Enter student name ");
      str=sc.next();
      v.addElement(str);
    }

    while(choice!=5)
    {
     System.out.println("1.Add new name\n2.Delete name\n3.Display name\n4.Display Vector\n5.Exit\nEnter your choice:");
     choice=sc.nextInt();
     switch(choice)
     {
        case 1: System.out.print("Enter student name ");
      		str=sc.next();
                v.addElement(str); //Adds the specified component to the end of this vector, increasing its size by one.
	        break;
        case 2: System.out.print("Enter student name to be removed ");
                str=sc.next();
                v.removeElement(str); //Removes the first occurrence of the specified element in this vector, 
                                      //If the vector does not contain the element, it is unchanged.
	        break;
        case 3: System.out.print("Enter index value for which name to be displayed ");
                i=sc.nextInt();
                System.out.println("Name:"+v.elementAt(i));
               	break;
        case 4: System.out.println("Current List ");
		//for displaying the vector using iterator concept.
                for(i=0;i<=v.size()-1;i++)
                {
                  System.out.println(v.elementAt(i));  //Returns the component at the specified index.
                 }				
        case 5: 
                break;
        default: 
                System.out.println("Invalid choice");
      } 
      
   }
 }
}
