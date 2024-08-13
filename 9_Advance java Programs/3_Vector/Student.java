
  /* W.A.P to accept student names from the command line & 
     store them in a vector */

 package yogesh;

 import java.util.*;

 class Student
 {
  public static void main(String args[]) 
  {
    Vector v=new Vector();
   
    int i,n;
    n=args.length;
 
    for(i=0;i<=n-1;i++)
    {
      v.addElement(args[i]);
    }

    for(i=0;i<=n-1;i++)
    {
      System.out.println(v.elementAt(i));
    }
  }
 }