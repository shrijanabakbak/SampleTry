package Swing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnect {
	public Statement connection() {
		Connection con;
		Statement stmt= null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cs27c","root","abcdefgh");
			stmt =   con.createStatement();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return stmt;
	}

}
