
package abc;


class OddNumbers extends Thread
{
    public void run()
    {
        for(int i=1;i<=100;i+=2)  //i=i+2
        {
            System.out.println(i);
        }//end of for
    } //end of run
}
