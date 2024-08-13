
   /* W.A.P to insert a record into the table employee which is stored 
      on emp database on MySQL DBMS */
   
   package yogeshjdbc;    
   
   //Step 1
   import java.sql.*;

   class MyJdbcApp1
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

        //CHANGES : insert the employee details via .java file
        String str="Insert into employee values(1745,'pooja',75000)";
        int result=st.executeUpdate(str);   
        System.out.println("Record Inserted:"+str);  
    
        conn.close(); //Step 7
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
       




