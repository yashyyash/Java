
package abc;

import java.util.Scanner;


class DivideSum 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 numbers ");
        
        int a=sc.nextInt();
        int b=sc.nextInt();
        
        int c=a/b;
        System.out.println("Division result is "+c);
        
        c=a+b;
        System.out.println("Addition result is "+c);
        
    }
}
