
package dravid;

import java.util.Scanner;


 class SwitchString 
 {
     public static void main(String[] args) 
     {
         String city;
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter your city name(mumbai/delhi)");
         city=sc.next();
         
         switch(city)
         {
             case "mumbai" : 
                              System.out.println("Welcome to mumbai");
                              break;
             case "delhi" : 
                              System.out.println("Welcome to delhi");
                              break;
             default :
                              System.out.println("Wrong Choice");
         }    
     }
}
