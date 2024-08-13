
package abc;

 //sub-class
 class Cylinder extends Circle
 {
     private int h;
     
     public Cylinder(int r,int h) //derived class constructor
     {
         super(r); //it will call super class constructor
         this.h=h;         
     }
     
     public double area()
     {
         return((2*Math.PI*getR()*h)+(2*super.area()));
     }
     
     public double volume()
     {
         return(super.area()*h);
     }
     
     
     
     
    
}
