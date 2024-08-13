

/*W.A.P to accept the length & breadth of Rectangle & display area & perimeter
  a=l*b;
  p=2*(l+b); */

package dravid;

import java.util.Scanner;

class AreaPerimeter 
{
    public static void main(String[] args) 
    {
        float l,b,a,p;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length & breadth of Rectangle ");
        l=sc.nextFloat();
        b=sc.nextFloat();
        
        a=l*b;
        p=2*(l+b);
        
        System.out.println("Area is "+a+","+"Perimeter is "+p);
     }
}
