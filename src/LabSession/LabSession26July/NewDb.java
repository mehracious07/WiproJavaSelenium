package JDBC_DEMO26JULY;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class NewDb {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url="jdbc:mysql://localhost:3306/org";
		String username="root";
		String password="sanjaymehra@123";
		//loaded the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		//Connection
		Connection cn = DriverManager.getConnection(url,username,password); 
		System.out.println("Connection Established");
		
		Statement st = cn.createStatement();
		String query = "Select *from worker";
		ResultSet rs=st.executeQuery(query);
		
		while(rs.next()) {
			System.out.println(rs.getString("First_Name"));
		}
		
		

	}

}
