
package abc;

 class ThreadImplements 
 {
     public static void main(String[] args) 
     {
         MyRunnable r=new MyRunnable();
         Thread t=new Thread(r); //Step 3
         t.start(); //Step 4 (internally start() will call run()
         
         for(int i=1;i<=500;i++)
         {
               System.out.println("Greetings from Main Thread");
         }//end of for
          System.out.println("End of Main Thread");
     } //end of main()
}//end of class
