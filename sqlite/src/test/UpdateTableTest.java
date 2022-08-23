package test;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import database.ConnectionFactory;

public class UpdateTableTest {
	public static void main(String[] args) {
		try {
			
			String name = "douglas";
			
			Connection connection = 
					ConnectionFactory.getConnection().
									  getConnection();
			
			String sql = "update test "
					+ "set name='Douglas' "
					+ "where name=? "
				;
			
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, name);
			stmt.execute();
			
			System.out.println("OK");
			connection.close();
			}
			catch(SQLException | IOException e) {
				e.printStackTrace();
			}
	}
}
