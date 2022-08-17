package test;

import database.Connection;

public class ConnectionTest {
	public static void main(String[] args) {
		System.out.println(new Connection().checkConnection());
	}
}
