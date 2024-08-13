
package xyz;

//dim : dimension
//Super class 
//abstract class
abstract class Shape 
{
   protected double dim1;
   protected double dim2;   
   
   //par constructor
   public Shape(double dim1,double dim2)
   {
       this.dim1=dim1;
       this.dim2=dim2;
   }
   //area() will be defined in the dervied class as per their requirement
   //abstract method - first time in Java a method is declared
   abstract public double area();   
}
