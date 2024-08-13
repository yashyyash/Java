
package abc;


class UseMethodOver1 
{
    public static void main(String[] args) 
    {
        MethodOver1 m=new MethodOver1();
        
        m.show('E'); //it calls show() of char
        m.show(12);  //it calls show() of int
        m.show("Hello"); //it calls show() of string
        m.show(2.4f);  //it calls show() of float
        
        m.show(1000L); //it calls show() of float
        
        //m.show(23.5);
        //m.show(true);
        
    }
}
