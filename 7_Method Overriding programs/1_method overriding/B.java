
package abc;

 //sub-class
 class B extends A
 {
    public void show()
    {
        //Syntax for calling super method of super class
        //super.methodName(args);
        super.show();
        System.out.println("Inside B");
        super.show();
        
    }
 }
