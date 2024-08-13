

 
   /*W.A.P to calculate area & circumference of the circle
   
     Assume Radius to be an integer & assign if any value of your choice */
	 
	 class Circle1
	 {
	    public static void main(String[] args)
		{
		   int r=10;
		   
		   double area,circ;
		   
		   area=Math.PI*Math.pow(r,2); //ClassName.methodname() if method is static
		   circ=2*Math.PI*r;
		   
		   System.out.println("Area is "+area);
		   System.out.println("Circumference is "+circ);
		} //end of main()
	 }//end of class