


 /*W.A.P to accept the radius from the user using CLA & then 
   display its Area & Circumference */

 class Circle
 {
      public static void main(String[] args)
      {
          int rad=Integer.parseInt(args[0]);
          
          System.out.println("Area is"+Math.PI*Math.pow(rad,2));
          System.out.println("Circumference is "+2*Math.PI*rad);

      }
 }