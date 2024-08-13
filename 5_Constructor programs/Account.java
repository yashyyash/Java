
package bank;

 class Account //Entity Class 
 {
    //3 Data Members are declared as private
    private int accid;
    private String name;
    private double bal;
    
    public void setData(int a,String n,double b)  //par. methods (formal args)
    {
      accid=a;
      name=n;
      bal=b;
    } //end of setData()
    
    public void showData()
    {
        System.out.println(accid+","+name+","+bal);
    }
 } //end of class
