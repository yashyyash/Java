
//W.A.P to accept a number & display its even or odd.

package dravid;

import java.util.Scanner;


 class EvenOdd 
 {
     public static void main(String[] args) 
     {
         int n;
         Scanner sc=new Scanner(System.in);
         
         System.out.print("Enter a number ");
         n=sc.nextInt();
         
         if(n%2==0)
             System.out.println("Even Number");
         else
             System.out.println("Odd Number");
     }
  }
