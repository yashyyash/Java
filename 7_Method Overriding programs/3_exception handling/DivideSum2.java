
package abc;

import java.util.InputMismatchException;
import java.util.Scanner;

//import java.util.*;

class DivideSum2
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 numbers ");
        
        int a=0,b=0,c;
        
        try
        {
           a=sc.nextInt();
           b=sc.nextInt();
            
           c=a/b;
           System.out.println("Division result is "+c);
        }
        catch(ArithmeticException AE)
        {
            System.out.println("Denominator should be positive");
        }  
        catch(InputMismatchException IE)
        {
            System.out.println("Please input integer only");
            System.exit(0); //Terminate the program immediately.
        }
        
        c=a+b;
        System.out.println("Addition result is "+c);        
    }
}
