
package xyz;


 class UseEmployee 
 {
     public static void main(String[] args) 
     {
         Employee e=new Employee(25,"Anil");
         e.show();
         Employee.showNextId();
         
         Employee f=new Employee(21,"Raj");
         f.show();
         Employee.showNextId();
         
         
     }
}
