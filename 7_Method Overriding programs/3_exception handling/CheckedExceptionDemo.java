
package abc;

import java.io.IOException;

 class CheckedExceptionDemo 
 {
     public static void main(String[] args) throws IOException
     {
         char ch;
         System.out.println("Enter a character ");
         ch=(char) System.in.read();
         
         System.out.println(ch);
     }
}
