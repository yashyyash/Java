
/*W.A.P to demonstrate the Method overloading where volume() will be overloaded
  multiple times to calculate the volume of Rectangle,Cylinder & Cube */

package abc;


class VolumeOverload 
{
    //To calculate the Volume of Rectangle
    public long volume(int l,int b,int h)
    {
        return(l*b*h);
    }
    
    //To calculate the Volume of Cylinder
    public double volume(double r,int h)
    {
        return(Math.PI*Math.pow(r,2)*h);
    }
    
     //To calculate the Volume of Cube
     public int volume(int x)
     {
         return(x*x*x);
     }
 }
