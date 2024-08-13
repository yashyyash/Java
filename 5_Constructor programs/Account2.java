
package bank;

class Account2 
{
    
    private int accid;
    private String name;
    private double bal;
    
    public  Account2() //non-parameterized constructor
    {
        accid=101;
        name=new String("Raj"); //name="Raj" without using new also 
        bal=67000.0;
    } //end of Constructor
    
    public void showData()
    {
        System.out.println(accid+","+name+","+bal);
    }
} //end of class
