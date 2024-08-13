
package xyz;

import java.util.Scanner;


class Account 
{
    private int accid;
    private String name;
    private double bal;
    
    private static double roi;
    
    static
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the ROI ");
       roi=sc.nextDouble();
    }
    
    public Account()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter accid,name & bal for Account ");
        accid=sc.nextInt();
        name=sc.next();
        bal=sc.nextDouble();
    }
    
    public void showData()
    {
        System.out.println(accid+","+name+","+bal);
    }
    
    public static void showRate()
    {
        System.out.println("Rate of Interest is "+roi);
    }
 }
