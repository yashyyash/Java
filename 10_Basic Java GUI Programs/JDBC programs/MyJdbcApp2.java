
  /* W.A.P to insert a record into the table employee which is stored on emp database 
     on MySQL DBMS but user will provide values at runtime via Scanner (METHOD 1) 
     using CONCATENATION OF STRING */

  package yogeshjdbc;   
 
  import java.sql.*; //Step 1
  import java.util.Scanner; //CHANGE 1

   class MyJdbcApp2
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
        
        Statement st=conn.createStatement(); //Step 4

        //CHANGE 2
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter emp id ");
        int eid=sc.nextInt();
        System.out.print("Enter emp name ");
        sc.nextLine(); //To clear the buffer
        String ename=sc.nextLine();        
        System.out.print("Enter emp sal ");
        int esal=sc.nextInt();   
               

        //CHANGE 3 
        //String str="Insert into employee values(eid,ename,esal)";  //WONT WORK
        
        //CONCATENATION OF STRING DONE using + -varchar requires single quotes (never used) hence use PreparedStatement
        String str="Insert into employee values("+eid+",'"+ename+"',"+esal+")"; 
        int result=st.executeUpdate(str);  
        System.out.println("Record Inserted:"+str);  
    
        conn.close();  //Step 7
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
       




