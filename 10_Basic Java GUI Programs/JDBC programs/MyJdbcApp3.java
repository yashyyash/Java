
   /* W.A.P to insert a record into the table employee which is stored on emp database on MySQL DBMS but user will
      provide values at runtime via Scanner (METHOD 2) using prepareStatement()  */

  package yogeshjdbc; 

  import java.sql.*; //Step 1
  import java.util.Scanner; //CHANGE 1

   class MyJdbcApp3
   {
    public static void main(String[] args)
    {
      try
      {
        Class.forName("com.mysql.jdbc.Driver"); //Step 2
        System.out.println("Driver Loaded Successfully");
        //Step 3
        //Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","Mysql1234");
        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp?characterEncoding=latin1&useConfigs=maxPerformance","root","Mysql1234"); 
        System.out.println("Connection obtained");
        //Statement st=conn.createStatement(); //not required now
        
        //CHANGE 2 use PreparedStatement instead of Statement to avoid SQLInjection Attack
        PreparedStatement ps=conn.prepareStatement("Insert into employee values(?,?,?)");
        //Its a subinterface of Statement

        //CHANGE 3 Inputs at run time
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter emp id ");
        int eid=sc.nextInt();
        System.out.print("Enter emp name ");
        sc.nextLine(); //To clear the buffer
        String ename=sc.nextLine();        
        System.out.print("Enter emp sal ");
        int esal=sc.nextInt();     

        //CHANGE 4 use setters to replace place holder (?)
        ps.setInt(1,eid);
        ps.setString(2,ename);
        ps.setInt(3,esal);               
  
        //CHANGE 4 
        int result=ps.executeUpdate();  

        System.out.println("Record Inserted");        
    
        conn.close();
      } //end of try
      catch(ClassNotFoundException cne )
      {
         System.out.println("Couldnt load the class"+cne);
      }
      catch(SQLException se)
      {
        System.out.println("SQL Error : "+se);
      }
   } //end of main()
  } //end of class
       




