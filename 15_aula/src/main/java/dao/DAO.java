package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAO {
	public static Connection createConnection() {
		String url, user, password;
		
		Connection cnx = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			url = "jdbc:mysql://localhost:3306/db_agenda";
			user = "root";
			password = "";
			
			cnx = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return cnx;
	}
}
