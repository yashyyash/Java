
package abc;


 class Circle implements Shape  
 {
    private double rad;
    
    public Circle(double r)
    {
        rad=r;
    }
    
    //overriding area() of shape interface
    public double area()
    {
        return (Math.PI*rad*rad);
    }
 }
