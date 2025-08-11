package JDBC_Rev;

import java.sql.*;

public class Rev {
    private static final String url = "jdbc:mysql://localhost:3306/room";
    private static final String user = "root";
    private static final String pass = "sanjaymehra@123";

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection cn = DriverManager.getConnection(url, user, pass);
        System.out.println("Connection established");

        Statement st = cn.createStatement();
        String query = "SELECT * FROM friends";
        ResultSet rs = st.executeQuery(query);
        ResultSetMetaData rsmd = rs.getMetaData();
        int columnCount = rsmd.getColumnCount();

        
        // Print column names
        System.out.println("Column Names:");
        for (int i = 1; i <= columnCount; i++) {
            System.out.print(rsmd.getColumnName(i) + "\t");
        }
        System.out.println("\n---------------------------");

        // Print data using column index
        while (rs.next()) {
            for (int i = 1; i <= columnCount; i++) {
                System.out.print(rs.getString(i) + "\t");
            }
            System.out.println();
        }

        rs.close();
        st.close();
        cn.close();
    }
}
