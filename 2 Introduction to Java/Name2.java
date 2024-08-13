

//W.A.P to accept the name of the user & display it on the screen
package dravid;

import java.util.Scanner;

class Name2 
{
    public static void main(String[] args) 
    {
        String name; //String Object reference is created(stack)
        Scanner sc=new Scanner(System.in);       
        
        System.out.print("Enter your name ");
        name=sc.nextLine();
        /*nextLine() is used to accept the strings from the user which has
          multiwords because its terminating char is only Enter key which is similar 
          to gets() in C*/
        
        System.out.println("Your name is "+name);      
    }
}
