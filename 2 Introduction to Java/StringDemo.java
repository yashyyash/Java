
//W.A.P to demonstrate String concept

package dravid;


 class StringDemo 
 {
     public static void main(String[] args) 
     {
         String s;
         s=new String("Mumbai");
         
         //String s=new String("Mumbai");         
         System.out.println("I Love "+s);
         
         String t;
         t=new String("Delhi");
         
         //String s=new String("Delhi");
         
         System.out.println("I Like "+t);         
         System.out.println(s==t);  //false
         System.out.println(s); //Mumbai
         System.out.println(t); //Delhi
     }
}
