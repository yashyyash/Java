
/* W.A.P which accepts some integers using command line arguments & display
   their sum.
   In case numbers passed via CLA are less then 2, then the 
   program should display the message "Please pass at least2 numbers */

package tom;


 class LengthDemo 
 {
     public static void main(String[] args) 
     {
         int n,sum=0;
         n=args.length; //IMP the number of arguments passed 
         
         if(n<=1)
         {
              System.out.print("Please provide atleast 2 int values");
         } //end of if
         else
         {
             for(int i=0;i<args.length;i++)
             {
                 sum=sum+Integer.parseInt(args[i]);
             }
             System.out.println("The sum is "+sum);
         } //end of else
    } //end of main()
 }//end of class
