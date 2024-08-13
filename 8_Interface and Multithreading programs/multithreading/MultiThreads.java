
package abc;


class MultiThreads 
{
    public static void main(String[] args) 
    {
        OddNumbers o=new OddNumbers();
        Thread t1=new Thread(o);
        
        EvenNumbers e=new EvenNumbers();
        Thread t2=new Thread(e);
        
        t1.start();
        t2.start();
    }
}
