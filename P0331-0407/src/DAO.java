

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DAO {
	// DriverManager
	Connection conn;
	Statement stmt;
	ResultSet rs;
	PreparedStatement psmt;
   public static String logined;
   
	
	
	
	
	public Connection getConnect() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.2:1521:xe", "hr", "hr");
//192.168.56.1
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		System.out.println("_________________________________________________");
		return conn;
	}

	public void disconnect() {
		try {
			if (rs != null)
				rs.close();
			if (stmt != null)
				stmt.close();
			if (conn != null)
				conn.close();
			if (psmt != null) {
				psmt.close();

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}


	
}
