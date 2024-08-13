

package javamath;

//Entity Class ,its visibility mode is "public"
public class Num 
{
   private int a,b,c;
   
   
   //set(),add() & show() visibility mode is "public"
   public void set(int a,int b) 
   {
       this.a=a;
       this.b=b;
   }
   
   public void add()
   {
       c=a+b;
   }
   
   public void show()
   {
       System.out.println("Numbers are "+a+","+b); 
       System.out.println("Sum is "+c);
   }
}
