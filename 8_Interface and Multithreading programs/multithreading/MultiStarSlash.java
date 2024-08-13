
package abc;


 class MultiStarSlash 
 {
     public static void main(String[] args) 
     {
         Star st=new Star();
         Thread t1=new Thread(st);
         
         Slash sl=new Slash();
         Thread t2=new Thread(sl);
         
         st.start();
         sl.start();
      } //end of main()
 } //end of class
