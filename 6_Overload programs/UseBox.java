
package abc;


public class UseBox 
{
    public static void main(String[] args) 
    {
        Box B1=new Box();
        Box B2=new Box(10);
        Box B3=new Box(5,7,9);
        //Box B4=new Box(B3);
        Box B4=B3;
        
        B1.show();
        B2.show();
        B3.show();
        B4.show();
    }
}
