
package abc;

//dim : dimension
//Super class
class Shape 
{
   double dim1;
   double dim2;   
   
   //par constructor
   public Shape(double dim1,double dim2)
   {
       this.dim1=dim1;
       this.dim2=dim2;
   }
   //area() will be defined in the dervied class as per their requirement
   public double area()
   {
       return 0.0;
   }
}
