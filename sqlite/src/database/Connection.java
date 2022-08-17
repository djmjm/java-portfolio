package database;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection {
	private java.sql.Connection 
			connection;
	
	public boolean checkConnection(){
		String url = "jdbc:sqlite:data/myDB/database.db";
		
		try {
			this.connection = DriverManager.
								getConnection(url)
								;
		}
		catch(SQLException e) {
			System.out.println(
					e.getMessage()
			); return false;
		}
		return true;
	}
	
}
