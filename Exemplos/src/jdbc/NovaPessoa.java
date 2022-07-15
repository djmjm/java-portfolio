package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NovaPessoa {
	public static void main(String[] args) 
	throws SQLException{
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o nome: ");
		String nome = entrada.nextLine();
		
		entrada.close();
		
		final String nome_db = 
				"java_exemplo_db"
				;
		
		Connection conexao = 
				FabricaConexao.getConexao(nome_db);
		
		String sql = 
				"insert into pessoas (nome) values (?)";
		
		PreparedStatement stmt = 
				conexao.prepareStatement(sql);
		
		stmt.setString(1, nome);
		
		stmt.execute();
		
		System.out.println("Pessoa incluida com sucesso!!");
	}
}
