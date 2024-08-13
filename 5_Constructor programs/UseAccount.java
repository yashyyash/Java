
package bank;

import java.util.Scanner;

class UseAccount //Driver Class
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        
        int a;
        String n;
        double b;
        
        System.out.print("Enter Accid,Name & Balance ");
        a=sc.nextInt();
        //n=sc.next();
        sc.nextLine(); //to clear the input buffer  - fflush(stdin);
        
        n=sc.nextLine();
        b=sc.nextDouble();
        
        Account acc1=new Account();        
        acc1.setData(a,n,b);  //acutal arguments
        acc1.showData();        
    } //end of main()
} //end of Driver Class - UseAccount
