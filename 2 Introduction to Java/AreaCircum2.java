
package dravid;

import java.util.Scanner;

//Using Math Class - Version 2

 class AreaCircum2
 {
     public static void main(String[] args) 
     {
         int r;         
         Scanner sc=new Scanner(System.in);
         
         System.out.print("Enter radius ");
         r=sc.nextInt();    
        
        System.out.println("Area is "+Math.PI*Math.pow(r,2)+","+"Circumference is "+2*Math.PI*r);         
      }
 }
