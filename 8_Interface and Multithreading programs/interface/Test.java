
package abc;


class Test extends Student 
{
   protected  double m1,m2;
   
   public void setMarks(int x,int y)
   {
       m1=x;
       m2=y;
   }
   public void getMarks()
   {
       System.out.println("Sem 1 Marks are "+m1);
       System.out.println("Sem 2 Marks are "+m2);
   }
}
