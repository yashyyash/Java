

//W.A.P to accept 2 numbers & display the largest element

package dravid;

import java.util.Scanner;


 class Largest2 
 {
     public static void main(String[] args) 
     {
        int n1,n2,l;
        Scanner sc=new Scanner(System.in);
        
         System.out.print("Enter 2 numbers ");
         n1=sc.nextInt();
         n2=sc.nextInt();
         
         l=(n1>n2)?n1:n2; //?: conditional operator or ternary operator
         
         System.out.println("The largest element is "+l);
        
     }
}
