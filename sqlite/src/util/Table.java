package util;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import database.ConnectionFactory;

public class Table {
	public static void drop(String tableName) {
		try {
			Connection connection =
					ConnectionFactory.getConnection().
									  getConnection()
					;
			String sql =
					"drop table " +
					tableName
					;
			Statement stmt = 
					connection.createStatement()
					;
					stmt.execute(sql)
					;
			System.out.println("Drop table ".
							   concat(tableName).
							   concat(" success!!!")
					)
			;
			connection.close();
		}
		catch(SQLException | IOException e) {
			e.printStackTrace();
		}
	}
}
