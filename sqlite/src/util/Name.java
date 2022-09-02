package util;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import database.ConnectionFactory;

public abstract class Name {
	public static List<String> 
		getList(String nameTable) {
			
		try {
			Connection connection =
					ConnectionFactory.getConnection().
									  getConnection()
					;
			String sql =
					"select name from " +
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
					answer.getString("name")
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
	
	public static List<String> 
	getList(String nameTable, String nameLike) {
		
		try {
			Connection connection =
					ConnectionFactory.getConnection().
									  getConnection()
					;
			String sql =
					" select name from " +
					nameTable +
					" where name like '" +
					nameLike +"';"
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
					answer.getString("name")
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
