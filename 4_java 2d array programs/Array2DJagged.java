
//W.A.P to give a simple demo on 2D Jagged array

package xyz;
 
import java.util.Scanner;

class Array2DJagged 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        
        int [][]arr=new int[3][];
        int i,j;
        
        arr[0]=new int[4];  //row 1 is having 4 cols
        arr[1]=new int[2];  //row 2 is having 2 cols
        arr[2]=new int[3];  //row 3 is having 3 cols
        
        //Accepting Jagged 2D array elements
        for(i=0;i<arr.length;i++)
        {
            System.out.println("Enter elements for Row "+(i+1));
            for(j=0;j<arr[i].length;j++)
            {
                System.out.print("Enter a number ");
                arr[i][j]=sc.nextInt();
            } //end of j loop
         }//end of i loop  
        
        
        //Displaying Jagged 2D array
        for(i=0;i<arr.length;i++)
        {
             for(j=0;j<arr[i].length;j++)
             {
                 System.out.print(arr[i][j]+" ");
             }
            //To take the cursor on the new line after each row
             System.out.println("");  
        }    
    } //end of main()
}//end of class
