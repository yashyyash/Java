
package bank;


class Account3 
{
    private int accid;
    private String name;
    private double bal;
    
    public  Account3(int accid,String name,double bal) //parameterized constructor
    {
        this.accid=accid;
        this.name=name;
        this.bal=bal;
        
    } //end of Constructor
    
    public void showData()
    {
        System.out.println(accid+","+name+","+bal);
    }
}
