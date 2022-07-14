package jdbc;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CriarBanco {
	public static void main(String[] args) throws SQLException{
		final String url = 
				"jdbc:mariadb://localhost:3306/?"
				+ "verifyServerCertificate=false"
				+ "&"
				+"useSSL=false"
				;
		final String usuario =
				"root"
				;
		final String senha = "";
		
		Connection conexao = DriverManager.
				getConnection(url, usuario, senha)
				;
		Statement stmt = conexao.createStatement();
		final String nome_db = "java_exemplo_db";
		
		stmt.execute( "CREATE DATABASE "
				+ "IF NOT EXISTS " + nome_db );
		
		
		System.out.println("Banco de dados " +
							nome_db +
						   " criado com sucesso !!!");
		conexao.close();
	}
}
