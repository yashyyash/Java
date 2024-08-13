
/* W.A.P to get empname,empsal columns details from the table employee 
   which is stored on emp database on MySQL  */

//NOTE :: In JDBC,maximum its Interfaces only like Connection,Statement,ResultSet
    
package yogeshjdbc;

//Step 1 : It has required classes & interfaces
import java.sql.*;

public class MyJdbcApp 
{
    public static void main(String[] args)
    {
      try
      {
        Class.forName("com.mysql.jdbc.Driver"); //Step 2 : mysql driver
        System.out.println("Driver Loaded Successfully(Registration done)");
        //Step 3
        //Line 17 due to encoding scheme changed else it might give error
        //Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","Mysql1234");  
        //emp database we are connecting to,username : root, password : Mysql1234
        Connection conn1=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp?characterEncoding=latin1&useConfigs=maxPerformance","root","Mysql1234"); 
        System.out.println("Connection obtained");
   
        Statement st=conn1.createStatement(); //Step 4
        ResultSet rs=st.executeQuery("Select empname,empsal from employee"); 
        //Step 5 - Fire the Query Finally and select requires executeQuery() only

        //Fetch the date from ResultSet using next() & not from database
        while(rs.next()) //Step 6  
        {
          String s=rs.getString("empname");  //getter method requires colname/position of table employee
          int amt=rs.getInt("empsal"); //gettter method requires colname/position of table employee
          System.out.println(s+"\t"+amt);
        }
        conn1.close();  //Step 7(disconnect the database) 
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
}
