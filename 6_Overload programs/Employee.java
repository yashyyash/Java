
package tom;

//Super Class
class Employee 
{
    private String name;
    private double sal;
    
    public void setData(String name,double sal)
    {
        this.name=name;
        this.sal=sal;
    }
    
    public String getName()
    {
        return name;        
    }
    
    public double getSal()
    {
        return sal;
    }
}
