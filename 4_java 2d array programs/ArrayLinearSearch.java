
//W.A.P to implement Linear Search where array elements may not be Unique

package xyz;

import java.util.Scanner;

class ArrayLinearSearch 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int arr[]; //Array object reference
        
        int i,n,s,count=0;
        
        System.out.print("Enter Array Size ");
        n=sc.nextInt();
        
        arr=new int[n]; //Array object is created
        
        System.out.print("Enter array elements ");
        
        for(i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        System.out.print("Enter the number to be searched ");
        s=sc.nextInt();
        
        for(i=0;i<arr.length;i++)
        {
           if(arr[i]==s)
           {
               System.out.println("Number found at"+(i+1)+"position");
               count++;          
           }    
        } //end of for
        
       if(count==0)
            System.out.print("Number not found");
} //end of main()
} //end of class
