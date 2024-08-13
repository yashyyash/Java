
package tom;

 //sub-class
 class Manager extends Employee
 {
    private double bonus;
    
    public void setBonus(double bonus)
    {
        this.bonus=bonus;
    }
    
    public double getIncome()
    {
        double amt;        
        amt=super.getSal()+bonus;
        return amt;
    }
 }
