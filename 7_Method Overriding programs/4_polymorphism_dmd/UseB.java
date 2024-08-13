
package abc;


 class UseB 
 {
     public static void main(String[] args) 
     {
         A ref=new A();
         ref.show(); //Early binding rule followed
         ref.display(); //Late binding rule followed
         
         
         ref=new B(); 
         ref.show(); //Early binding rule followed
         ref.display(); //Late binding rule followed
     }
}
