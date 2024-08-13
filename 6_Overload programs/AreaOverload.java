
package abc;


 class AreaOverload 
 {
    //To calculate the Area of Rectangle
    public float area(float length,float width)
    {
        return(length*width);
    }
    
    //To calculate the Area of Circle
    public double area(double radius)
    {
        return(Math.PI*Math.pow(radius,2));
    }
    
 }
