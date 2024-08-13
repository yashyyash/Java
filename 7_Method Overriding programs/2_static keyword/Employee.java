
package xyz;

 class Employee 
 {
    private int age;
    private String name;
    private int id;
    
    //static data member
    private static int nextId=1;
    
    //Par Constructor
    public Employee(int a,String n)
    {
        age=a;
        name=n;
        id=nextId++; //V.imp
    }
    
    public void show()
    {
        System.out.println(age+","+name+","+id);
    }
    
    public static void showNextId()  //getNextId()
    {
        System.out.println("Next Employee id will be "+nextId);
    }
}  //End of Entity Class - Employee
