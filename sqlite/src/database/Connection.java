package database;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection{
	private String databaseName;
	private String databaseURL;
	
	private String connectionURL;
	private java.sql.Connection 
			connection;

	public Connection() 
	throws SQLException{
		this("database.db", "data/myDB/");
	}
	
	public Connection
	( String databaseName, 
	  String databaseURL ) 
	throws SQLException{
		
		this.databaseName = databaseName;
		this.databaseURL = databaseURL;
		connectionURL = "jdbc:sqlite:" 
				 		+ databaseURL + databaseName;
		
		boolean isConnectionOK = 
				checkConnection();
		
		if( isConnectionOK ) {
			connection = 
					DriverManager.
					getConnection(connectionURL);
		}
	}

	private boolean checkConnection(){
		String url = connectionURL;
		
		try {
			DriverManager.getConnection(url);
		}
		catch(SQLException e) {
			System.out.println(
					e.getMessage()
			); return false;
		}
		return true;
	}

	public java.sql.Connection getConnection() {
		return connection;
	}
	
	@Override
	public String toString() {
		Boolean answer = checkConnection();
		return answer.toString();
	}
	
}
