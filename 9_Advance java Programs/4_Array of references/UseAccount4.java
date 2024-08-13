
package bank;

import java.util.Scanner;


 class UseAccount4 
 {
     public static void main(String[] args) 
     {
         Account4[] A=new Account4[2];
         Scanner sc=new Scanner(System.in);
         
         for(int i=0;i<A.length;i++)
         {
            System.out.println("Enter Accid,Name & Balance ");
            int id=sc.nextInt();
            String name=sc.next();
            double bal=sc.nextDouble();         
            A[i]=new Account4(id,name,bal);       
         }
         
         for(int i=0;i<A.length;i++)
         {
            A[i].showData();
         }
      }//end of main()     
 }//end of class
