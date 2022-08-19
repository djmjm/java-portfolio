package test;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import database.ConnectionFactory;

public class RemoveTest {
	public static void main(String[] args) {
		try {
			Connection connection =
					ConnectionFactory.getConnection().
									  getConnection()
					;
			String sql =
					"delete from test where name='testing ...'"
					;
			Statement stmt = connection.createStatement();
			stmt.execute(sql);
			
			System.out.println("ok");
			
			}
		catch(SQLException | IOException e) {
			e.printStackTrace();
		}
	}
}
