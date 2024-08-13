/* W.A.P to demonstrate Vector class methods */ 

package yogesh;

import java.util.*; //contains Vector Class

class VectorMethods 
{
 public static void main(String args[]) 
 {
  Vector v = new Vector(3,2); //intial capacity : 3,increment value :2  
  System.out.println("Initial size: " + v.size()); //check initial size
  System.out.println("Initial capacity: " +v.capacity()); //check initial capacity
  
  v.addElement(new Integer(1));
  v.addElement(new Integer(2));
  v.addElement(new Integer(3));
  v.addElement(new Integer(4));  
  System.out.println("Size after 4 additions: " +v.size()); 
  System.out.println("Capacity after 4 additions: " +v.capacity());
  
  v.addElement(new Double(5.45));
  System.out.println("Size after 5 additions: " +v.size());  
  System.out.println("Capacity after 5 additions: " +v.capacity());
  
  v.addElement(new Double(6.08));
  v.addElement(new Integer(7));
  System.out.println("Size after 7 additions: " +v.size());  
  System.out.println("Capacity after 7 additions: " +v.capacity());
  
  v.addElement(new Float(9.4f));
  v.addElement(new Integer(9));
  System.out.println("Size after 9 additions: " +v.size());  
  System.out.println("Capacity after 9 additions: " +v.capacity());
  
  v.addElement(new Integer(10));
  v.addElement(new Integer(11));
  System.out.println("Size after 11 additions: " +v.size());  
  System.out.println("Capacity after 11 additions: " +v.capacity());
  
  System.out.println("First element: "+(Integer) v.firstElement());
  System.out.println("Last element: "+(Integer) v.lastElement());
  
  if(v.contains(new Integer(3)))
  {
	 System.out.println("Vector contains 3"); 
  }	  
  
  //enumerate the elements in the vector.
    Enumeration vEnum = v.elements();
	
	System.out.println("\n Elements in Vector :");
	
	while(vEnum.hasMoreElements())
	{
		System.out.println(vEnum.nextElement() + " ");
	}		
  
 }
}