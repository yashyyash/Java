
package abc;


class UseCylinder 
{
    public static void main(String[] args) 
    {
        Cylinder c=new Cylinder(10,20);
        
        System.out.println("Volume of Cylinder is "+c.volume());
        System.out.println("Area of Cylinder is "+c.area());
    }
}
