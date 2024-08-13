
package abc;

//Super Class
class Circle 
{
   private int r;
   
   public Circle(int r)  //par constructor
   {
     this.r=r;  
   } 
   
   public int getR()//method 1
   {
       return r;
   }
   
   public double area() //method 2
   {
       return(Math.PI*Math.pow(r, 2));
   }   
}
