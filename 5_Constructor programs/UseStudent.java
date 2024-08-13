
package college;

import java.io.IOException;
import java.util.Scanner;


public class UseStudent //Driver Class
{
    public static void main(String[] args) throws IOException
     {
         Scanner sc=new Scanner(System.in);
         Student s=new Student();
         
         System.out.println("Enter RollNo,name,gender & percentage ");
         int rno=sc.nextInt();
         String name=sc.next();
         char gender=(char)System.in.read();
         float per=sc.nextFloat();
         
         s.setData(rno, name, gender, per);
         s.getData(); 
         
         
         Student p=new Student();
         System.out.println("Enter RollNo,name,gender & percentage ");
         rno=sc.nextInt();
         name=sc.next();
         gender=(char)System.in.read();
         per=sc.nextFloat();
         
         p.setData(rno, name, gender, per);
         p.getData(); 
     }   
}
