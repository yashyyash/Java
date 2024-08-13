
package college;

import java.io.IOException;


 class Student //Entity Class
 {
   private int rno;
   private String name;
   private char gender;
   private float per;

   public void setData(int rno,String name,char gender,float per) throws IOException
   {
        this.rno=rno;
        this.name=name;
        this.gender=gender;
        this.per=per;
   }   
   
   public void getData()
   {
       System.out.println(rno+","+name+","+gender+","+per);
   }
       
 }
