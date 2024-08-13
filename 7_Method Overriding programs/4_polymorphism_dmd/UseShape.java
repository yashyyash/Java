
package abc;


class UseShape 
{
    public static void main(String[] args) 
    {
        Shape S=new Rectangle(10,20);
        System.out.println("Area of Rectangle is "+S.area());
        
        S=new Triangle(10,20);
        System.out.println("Area of Triangle is "+S.area());
    }
}
