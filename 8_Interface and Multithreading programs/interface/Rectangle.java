
package abc;


class Rectangle implements Shape
{
    private double l,b;
    
    public Rectangle(double x,double y)
    {
        l=x;
        b=y;
    }
    //overriding area() of shape interface
    public double area()
    {
        return l*b;
    }
}
