
//W.A.P to give a simple demo on 2D Jagged array

package xyz;
 
import java.util.Scanner;

class Array2DJagged1 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        
        int [][]arr=new int[3][];
        int i,j,c;
        
                
        //Accepting Jagged 2D array elements
        for(i=0;i<arr.length;i++)
        {
            System.out.println("Enter column size for Row "+(i+1));
            c=sc.nextInt();
            arr[i]=new int[c];            
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
