
package abc;


 class EvenNumbers extends Thread
 {
    public void run()
    {
        for(int i=2;i<=100;i+=2)  //i=i+2
        {
            System.out.println(i);
        }//end of for
    } //end of run
}
