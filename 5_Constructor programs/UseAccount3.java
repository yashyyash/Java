
package bank;

import java.util.Scanner;


 class UseAccount3 
 {
     public static void main(String[] args) 
     {
         Scanner sc=new Scanner(System.in);
         
         System.out.println("Enter Accid,Name & Balance ");
         int id=sc.nextInt();
         String name=sc.next();
         double bal=sc.nextDouble();
         
         Account3 acc1=new Account3(id,name,bal);
         
         acc1.showData();
     }
    
 }
