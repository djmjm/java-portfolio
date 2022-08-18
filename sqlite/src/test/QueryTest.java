package test;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import database.ConnectionFactory;

public class QueryTest {
	public static void main(String[] args) {
		try {
			Connection connection =
					ConnectionFactory.getConnection().
									  getConnection()
					;
			String sql =
					"select * from test"
					;
			Statement stmt = 
					connection.createStatement()
					;
			ResultSet answer =
					stmt.executeQuery(sql)
					;
			
			while(answer.next()) {
				System.out.println(answer.getString("name"));
			}
			
			sql = "select count (name) from "
				+ "test where name='testing ...' "
			;
			
			answer = stmt.executeQuery(sql);
			
			System.out.println(answer.getInt(1));
			
			}
		catch(SQLException | IOException e) {
			e.printStackTrace();
		}
	}
}
