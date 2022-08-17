package test;

import java.sql.SQLException;

import database.Connection;

public class ConnectionOpenCloseTest {
	public static void main(String[] args) {
		try {
			Connection connection = new Connection();
			connection.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
