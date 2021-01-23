package com.mycompany.app;
import java.sql.*;
/**
 * Hello world!
 *
 */
public class ConnectionTest
{
   // JDBC driver name and database URL
   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
   static final String DB_URL = "jdbc:mysql://localhost";

   //  Database credentials
   static final String USER = "root";
   static final String PASS = "";
   
   public static void main(String[] args) {
   Connection conn = null;
   Statement stmt = null;
   try{
      //STEP 2: Register JDBC driver
      Class.forName("com.mysql.jdbc.Driver");

      //STEP 3: Open a connection
      System.out.println("Connecting to database...");
      conn = DriverManager.getConnection(DB_URL,USER,PASS);
      System.out.println(".. Connected!");

      //STEP 4: Execute a query
      // System.out.println("Creating statement...");
      // stmt = conn.createStatement();
      // String sql;
      // sql = "SELECT * FROM pet";
      // ResultSet rs = stmt.executeQuery(sql);

      // //STEP 5: Extract data from result set
      // while(rs.next()){
      //    //Retrieve by column name
      //    String name  = rs.getString("name");
      //    String species = rs.getString("Species");
      //    String dob = rs.getString("d_o_b");
      //    String hair_color = rs.getString("hair_color");
      //    //Display values
      //    System.out.print("ID: " + name);
      //    System.out.print(", Species: " + species);
      //    System.out.print(", D.O.B: " + dob);
      //    System.out.println(", Hair Color: " + hair_color);
      // }
      // //STEP 6: Clean-up environment
      // rs.close();
      // stmt.close();
      // conn.close();
      
   }catch(SQLException se){
      //Handle errors for JDBC
      se.printStackTrace();
   }catch(Exception e){
      //Handle errors for Class.forName
      e.printStackTrace();
   }finally{
      //finally block used to close resources
      try{
         if(stmt!=null)
            stmt.close();
      }catch(SQLException se2){
      }// nothing we can do
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se){
         se.printStackTrace();
      }//end finally try
   }//end try
   System.out.println("Goodbye!");
}//end main
}
