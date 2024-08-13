
package dravid;

import java.util.Scanner;

 class AreaCircum 
 {
     public static void main(String[] args) 
     {
         int r;
         double a,c;
         Scanner sc=new Scanner(System.in);
         
         System.out.print("Enter radius ");
         r=sc.nextInt();
         
         a=3.14*r*r;
         c=2*3.14*r;
         
         System.out.println("Area is "+a+","+"Circumference is "+c);         
      }
 }
