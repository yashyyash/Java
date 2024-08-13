

//W.A.P to accept the name of the user & display it on the screen
package dravid;

import java.util.Scanner;

class Name1 
{
    public static void main(String[] args) 
    {
        String name; //String Object reference is created(stack)
        Scanner sc=new Scanner(System.in);        
        
        System.out.print("Enter your name ");
        name=sc.next();
        /*next() is used to accept the strings from the user but the problem is
          it takes only single word strings ie its terminating char is either
          space or Enter key similar to scanf() problem in C*/
        
        System.out.println("Your name is "+name);      
    }
}
