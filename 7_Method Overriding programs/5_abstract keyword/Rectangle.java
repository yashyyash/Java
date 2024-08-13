
package xyz;


class Rectangle extends Shape 
{
  //par constructor
  public Rectangle(double l,double b)
  {
    super(l,b);  
  }
    
  //method area() is overridden
  public double area()
   {
       return (dim1*dim2);
   }
}
