
package dravid;

import java.util.Scanner;

//Using Math Class - Version 2

 class AreaCircum1
 {
     public static void main(String[] args) 
     {
         int r;
         float a,c;
         Scanner sc=new Scanner(System.in);
         
         System.out.print("Enter radius ");
         r=sc.nextInt();         
        
         a=(float)Math.PI*(float)Math.pow(r,2); //type casting
         c=2*(float)Math.PI*r;
         
         System.out.println("Area is "+a+","+"Circumference is "+c);         
      }
 }
