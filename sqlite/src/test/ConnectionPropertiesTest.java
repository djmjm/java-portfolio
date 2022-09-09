package test;

import java.io.InputStream;
import java.util.Properties;

import database.Connection;

public class ConnectionPropertiesTest {
	public static void main(String[] args) {
		
		Properties property = new Properties();
		String fileName = "/database/connection.properties";
		InputStream url =   ConnectionPropertiesTest.
							class.getResourceAsStream(
									fileName
							);
		
		try {
			
			property.load(url);
			String databaseName = 
					property.getProperty("db.name");
			String databaseURL = 
					property.getProperty("db.url");
			
			System.out.println(databaseName + databaseURL);
			System.out.println(new Connection(property) );
			
			var connectionTwo = new Connection(property);
			connectionTwo.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
