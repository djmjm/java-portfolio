package test;

import java.sql.SQLException;

import database.Connection;

public class ConnectionTest {
	public static void main(String[] args) {
		try {
			System.out.println(new Connection() );
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
