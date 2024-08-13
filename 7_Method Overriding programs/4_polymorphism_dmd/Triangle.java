
package abc;


class Triangle extends Shape 
{
    
    public Triangle(double b, double h) 
    {
        super(b,h);
    }
   
   //method area() is overridden
   public double area()
   {
       return (0.5*dim1*dim2);
   }
    
    
}
