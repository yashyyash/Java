

//W.A.P to find the largest element from the given 1D Array

package xyz;

import java.util.Scanner;

 class ArrayLargest 
 {
     public static void main(String[] args) 
     {
        Scanner sc=new Scanner(System.in);
        int arr[]; //Array object reference 
        
        int i,n,max;
        
         System.out.print("Enter array size ");
         n=sc.nextInt();
         
         arr=new int[n]; //Actual array is created
         
         System.out.print("Enter array elements ");
         
         for(i=0;i<n;i++)
         {    
             arr[i]=sc.nextInt();            
             
         }
         
         max=arr[0]; //Assume as of now arr[0] is the largest element
         
         for(i=1;i<n;i++)
         {
             if(arr[i]>max)
                 max=arr[i];
         }
         
         System.out.print("The largest element is "+max);
    }//end of main()
 } //end of class
