package util;

import java.sql.PreparedStatement;
import java.util.List;
import java.sql.Connection;

import database.ConnectionFactory;

public class NamesUpdateToUppercase {
	public static void main(String[] args) {
		List<String> listNames = 
				Name.getList("test")
				;
		
		try {
			while( !listNames.isEmpty() ) {
				
				var nameOrigin = listNames.get(0);
				var nameNew = nameOrigin.toUpperCase();
				
				Connection connection = 
						ConnectionFactory.getConnection().
										  getConnection();
				
				String sql = "update test "
						+ "set name=? "
						+ "where name=? "
					;
				
				PreparedStatement stmt = connection.prepareStatement(sql);
				stmt.setString(1, nameNew);
				stmt.setString(2, nameOrigin);
				stmt.execute();
				
				System.out.println(
						nameOrigin +
						" --->>> " +
						nameNew
						);
				connection.close();
				
				listNames.remove(0);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
