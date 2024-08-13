
package abc;


 class UseShape 
 {
     public static void main(String[] args) 
     {
        Shape s=new Circle(10);
        System.out.println("Area of Circle is "+s.area());
        
        s=new Rectangle(5,7);
        System.out.println("Area of Rectangle is "+s.area());
     }

 }
