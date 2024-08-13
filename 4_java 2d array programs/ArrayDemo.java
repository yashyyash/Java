
/* W.A.P to create an array of n integers where n is given by the user
   Then ask the user to input values in that array & finally
   display the array,sum & average of all array numbers
   using Scanner*/

package xyz;

import java.util.Scanner;

 class ArrayDemo 
 {
     public static void main(String[] args) 
     {
        Scanner sc=new Scanner(System.in);
        int arr[]; //Array object ref
        
        int n,i,sum=0;
        
        System.out.println("Enter array size ");
        n=sc.nextInt();
        
        arr=new int[n];        
        
         System.out.println("Enter array elements ");
         
         for(i=0;i<n;i++)
         {
             arr[i]=sc.nextInt();
             sum=sum+arr[i];
         }
         
         System.out.println("The array elements are");
         
         for(i=0;i<n;i++)
         {
             System.out.println(arr[i]);
         }
         
         System.out.println("Sum is "+sum);
         System.out.println("Average is "+(float) sum/n);     
      }
 }
