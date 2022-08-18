package test;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import database.ConnectionFactory;

public class CreateTableTest {
	public static void main(String[] args) {
		try {
		Connection connection = 
				ConnectionFactory.getConnection().
								  getConnection();
		
		String sql = "create table if not exists test ("
					+"id int auto_increment primary key,"
					+"name varchar(80) not null"
					+")";
		
		Statement stmt = connection.createStatement();
		stmt.execute(sql);
		
		System.out.println("OK");
		connection.close();
		}
		catch(SQLException | IOException e) {
			e.printStackTrace();
		}
	}
}
