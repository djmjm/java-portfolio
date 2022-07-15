package jdbc;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;

public class CriarBanco {
	public static void main(String[] args) throws SQLException{
		Connection conexao = FabricaConexao.getConexao();
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
