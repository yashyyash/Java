
//W.A.P to accept a char & display it

package tom;

import java.io.IOException;

class Char 
{
    public static void main(String[] args) throws IOException
    {
        char ch;
        System.out.println("Enter a character ");
        ch=(char) System.in.read();
        
        System.out.println(ch);
    }
}
