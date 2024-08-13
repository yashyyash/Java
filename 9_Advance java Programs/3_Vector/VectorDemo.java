 /* W.A.P to demonstrate adding elements to a Vector object & 
    display the capacity,size of the vector */ 

package yogesh;

import java.util.*; //contains Vector Class

class VectorDemo 
{
 public static void main(String args[]) 
 {
  Vector v = new Vector(5,3); //intial capacity : 5,increment value :3  
  System.out.println("Initial size: " + v.size()); //check initial size
  System.out.println("Initial capacity: " +v.capacity()); //check initial capacity
  
  v.addElement(new Integer(4));
  v.addElement(new Integer(9));
  v.addElement(new Integer(3));  
  System.out.println("Size: " +v.size()); 
  System.out.println("Capacity: " +v.capacity());
  
  v.addElement(new Double(3.25));
  System.out.println("Size: " +v.size());  
  System.out.println("Current capacity: " +v.capacity());
  
  v.addElement(new Double(5.25));
  System.out.println("Size: " +v.size()); 
  System.out.println("Current capacity: " +v.capacity());
  
  //IMP
  v.addElement(new Double(4.25));
  System.out.println("Size: " +v.size()); 
  System.out.println("Current capacity: " +v.capacity());
 }
}