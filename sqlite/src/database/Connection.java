package database;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

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
	
	public Connection(Properties property) 
	throws SQLException{
		this(property.getProperty("db.name"), 
			 property.getProperty("db.url")
			 );
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
	
	public void close() {
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public String toString() {
		Boolean answer = checkConnection();
		return answer.toString();
	}
	
}
