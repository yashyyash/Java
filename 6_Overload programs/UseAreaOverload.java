
package abc;


class UseAreaOverload 
{
    public static void main(String[] args) 
    {
        AreaOverload a=new AreaOverload();
        
        System.out.println("Area of Rectangle is "+a.area(1.5f,3.6f));
        System.out.println("Area of Circle is "+a.area(2.5));
    }
}
