

  //W.A.P to accept 2 integers & display their sum using CLA

  class Sum1
  {
     public static void main(String[] args)
     {
         int a,b,c;
         a=Integer.parseInt(args[0]);      
         b=Integer.parseInt(args[1]); 
         c=a+b;
         
         System.out.println("Sum is "+c);
     }
  }

  /* parseInt()  : Its a static method because its called using ClassName
                   ClassName.staticMethodName();   Integer.parseInt();
                   It will accept the argument as a string & will return its int                    representation */
    