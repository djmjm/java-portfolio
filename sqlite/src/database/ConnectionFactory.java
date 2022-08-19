package database;

import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.Properties;

import test.ConnectionPropertiesTest;

public class ConnectionFactory {
	public static Connection getConnection() 
	throws IOException, SQLException {
		Properties property = new Properties();
		String fileName = "/database/connection.properties";
		InputStream url =   ConnectionFactory.
							class.getResourceAsStream(
									fileName
							);
		
		property.load(url);
		String databaseName = 
				property.getProperty("db.name");
		String databaseURL = 
				property.getProperty("db.url");
		
		return new Connection(databaseName, 
							  databaseURL);
	}
	
	public static Connection getConnection(String fileName) 
			throws IOException, SQLException {
				Properties property = new Properties();
				InputStream url =   ConnectionFactory.
									class.getResourceAsStream(
											fileName
									);
				
				property.load(url);
				String databaseName = 
						property.getProperty("db.name");
				String databaseURL = 
						property.getProperty("db.url");
				
				return new Connection(databaseName, 
									  databaseURL);
			}
}
