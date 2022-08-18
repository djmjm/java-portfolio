package test;

import database.ConnectionFactory;

public class ConnectionFactoryTest {
	public static void main(String[] args) {
		try {
			System.out.println(
				ConnectionFactory.getConnection()
			);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
