package util;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import database.ConnectionFactory;

public class CPF {
	public static List<String>
	getList(String nameTable) {
		try {
			Connection connection =
					ConnectionFactory.getConnection().
									  getConnection()
					;
			String sql =
					"select cpf from " +
					nameTable
					;
			Statement stmt = 
					connection.createStatement()
					;
			ResultSet answer =
					stmt.executeQuery(sql)
					;
			
			List<String> list  = new  ArrayList<String>();
			while(answer.next()) {
				list.add(
					answer.getString("cpf")
				)
				;
			}
			connection.close();
			return list;
			
		}
		catch(SQLException | IOException e) {
			e.printStackTrace();
			return new ArrayList<String>();
		}
	}
}
