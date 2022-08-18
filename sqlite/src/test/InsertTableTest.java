package test;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import database.ConnectionFactory;

public class InsertTableTest {
	public static void main(String[] args) {
		try {
			Scanner reader = new Scanner(System.in);
			String name = reader.nextLine();
			reader.close();
			
			Connection connection = 
					ConnectionFactory.getConnection().
									  getConnection();
			
			String sql = "insert into test (name) values (?)";
			
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
