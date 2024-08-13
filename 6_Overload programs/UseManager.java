
package tom;

//Driver Class 
class UseManager 
 {
     public static void main(String[] args) 
     {
         Manager boss=new Manager();
         boss.setData("Raj",50000.0);
         boss.setBonus(20000.0);
         
         System.out.println("Manager Name is "+boss.getName());
         System.out.println("Manager Income is "+boss.getIncome());
         
     }
}
