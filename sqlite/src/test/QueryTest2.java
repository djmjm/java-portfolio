package test;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import database.ConnectionFactory;

public class QueryTest2 {
	public static void main(String[] args) {
		try {
			Connection connection =
					ConnectionFactory.getConnection().
									  getConnection()
					;
			String sql =
					"select * from test "
				  + "where name like 'd%'"
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
			
		}
		catch(SQLException | IOException e) {
			e.printStackTrace();
		}
	}
}
