
/*W.A.P to cretae a rectangular 2D array of the rows & cols decided by the
  user. Ask the user to input all the array elements & then display the values
  in the matrix form also display their sum & average */

package xyz;

import java.util.Scanner;


class Array2DSumAvg 
{
    public static void main(String[] args) 
    {
       Scanner sc=new Scanner(System.in);
       int r,c,i,j,sum=0;
       
        System.out.print("Enter row size & col size ");
        r=sc.nextInt();
        c=sc.nextInt();
        
        //2D array ref & actual array is created
        int [][]arr;
        arr=new int[r][c];        
        //int [][]arr=new int[r][c];
        
        //Accepting the 2D array elements
        System.out.println("Enter 2D array elements ");
        for(i=0;i<arr.length;i++) //to manage rows
        {
            System.out.println("Enter elements for Row "+(i+1));
            for(j=0;j<arr[i].length;j++) //to manage cols
            {
                System.out.print("Enter a number ");
                arr[i][j]=sc.nextInt();
            }
        }
        
        //Displaying the 2D array (matrix form) 
        System.out.println("2D array elements are ");
        for(i=0;i<arr.length;i++)
        {
            for(j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+" ");
                sum=sum+arr[i][j];
            }
            //to take the cursor on the new lineafter every row
            System.out.println(""); 
        }    
        
        
        System.out.println("Sum is "+sum);
        System.out.print("Average is "+(double)sum/(r*c));
        
    } //end of main()
} //end of class
