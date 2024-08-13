
package abc;

import java.util.Scanner;


 class DivideSum3 
 {
     public static void main(String[] args) 
     {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter 2 integers ");
         int a,b,c;
         a=sc.nextInt();
         b=sc.nextInt();
         
         try
         {
           if(a<=0)
           {
               ArithmeticException e=new ArithmeticException("Num should be positive & non-zero");
               throw e;
           }
           if(b<=0)
           {
               ArithmeticException e=new ArithmeticException("Dem should be positive & non-zero");
               throw e;
           }
           c=a/b;
           System.out.println("Division result is "+c);
          }//end of try
          catch(ArithmeticException AE)
          {  
              System.out.println(AE.getMessage());
          } //end of catch
          finally
          {
             System.out.println("Have a Nice Day");
          }   
     } //end of main()
} //end of class
