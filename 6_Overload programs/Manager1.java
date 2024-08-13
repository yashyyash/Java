
package tom;

 //sub-class
 class Manager1 extends Employee
 {
    private double bonus;
    
    public void setBonus(double bonus)
    {
        this.bonus=bonus;
    }
    
    public double getSal()
    {
        double amt;        
        amt=super.getSal()+bonus;
        return amt;
    }
 }
