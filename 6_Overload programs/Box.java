
package abc;


class Box 
{
    private int l,b,h;
    
    public Box()
    {
        //l=b=h=0;
    }
    public Box(int s)
    {
        l=b=h=s;
    }
    public Box(int x,int y,int z)
    {
        l=x;
        b=y;
        h=z;
    }
    public Box(Box P)  //Copy Constructor
    {
        l=P.l;
        b=P.b;
        h=P.h;
    }
    
    public void show()
    {
        System.out.println(l+","+b+","+h);
    }
}
