

//W.A.P to accept the name of the user & display it on the screen
package dravid;

import java.util.Scanner;

class Name3 
{
    public static void main(String[] args) 
    {
        String name; //String Object reference is created(stack)
        Scanner sc=new Scanner(System.in);      
        
        System.out.print("Enter your name ");
        name=sc.next();        
        System.out.println("Your name is "+name); 
        
        sc.nextLine();//IMP :: to flush the stdin(input) buffer similar to fflush(stdin) in C
        
        String city;
        System.out.println("Enter your city ");
        city=sc.nextLine(); 
        System.out.println("Your city is "+city); 
        
    }
}
