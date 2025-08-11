package JDBC_DEMO26JULY;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		 String url = "jdbc:mysql://localhost:3306/college";
	        String username = "root";
	        String password = "sanjaymehra@123";
		
		  // Load MySQL JDBC driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        //Establish the connection
        @SuppressWarnings("unused")
		Connection con = DriverManager.getConnection(url,username,password);
	    System.out.println("Connection Established!!");
	    
	    Statement st =con.createStatement();
	    String selectQuery="Select *from  StudentRepo";
	    ResultSet rs= st.executeQuery(selectQuery);
	    
	    while(rs.next()) {
	    	System.out.print(rs.getString("Name"));
	    	System.out.print("-");
	    	System.out.println(rs.getString("Class"));
	    }
	}

}
