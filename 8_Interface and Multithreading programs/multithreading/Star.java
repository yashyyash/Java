
package abc;

 class Star extends Thread 
 {     
      public void run()
      {
          int i;
          for(i=1;i<=7;i++)
          {
              System.out.print("*");
              
              try
              {
                  Thread.sleep(1900);
              }
              catch(Exception e)
              {
                  //empty body
              }
          } //end of for
      } //end of run()    
 } //end of Star
