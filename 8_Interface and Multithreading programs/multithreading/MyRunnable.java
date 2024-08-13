
package abc;


 class MyRunnable implements Runnable //Step 1
 {
      public void run() //Step 2
      {
          for(int i=1;i<=500;i++)
          {
               System.out.println("Greetings from Child Thread");
          }//end of for
          System.out.println("End of Child Thread");
      }//end of run() 
 } //end of class MyRunnable
