
package tom;

//Driver Class 
class UseManager1 
 {
     public static void main(String[] args) 
     {
         Manager1 boss=new Manager1();
         boss.setData("Raj",50000.0);
         boss.setBonus(20000.0);
         
         System.out.println("Manager Name is "+boss.getName());
         System.out.println("Manager Income is "+boss.getSal());
         
     }
}
