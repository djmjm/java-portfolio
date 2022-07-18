package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AtualizarDesafio1 {
	public static void main(String[] args) 
	throws SQLException{
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o novo nome: ");
		String nome = entrada.nextLine();
		
		System.out.println("Informe o id para atualizar: ");
		int id = entrada.nextInt( );
		
		entrada.close();
		
		final String nome_db = 
				"java_exemplo_db"
				;
		
		Connection conexao = 
				FabricaConexao.getConexao(nome_db);
		
		String sql = 
				"select codigo, nome from pessoas"
				+ " where codigo = (?)";
		
		PreparedStatement stmt = 
				conexao.prepareStatement(sql);
		
		stmt.setInt(1, id);
		
		ResultSet result = stmt.executeQuery();
		
		if(result.next()) {
			Pessoa pessoa = new Pessoa(
					result.getInt(1),
					result.getString(2)
					)
					;
			System.out.println(pessoa);
			
			sql = "update pessoas set nome = ? "
				+ "where codigo = ?"
				;
			
			stmt.close();
			stmt = conexao.prepareStatement(sql);
			stmt.setString(1, nome);
			stmt.setInt(2, id);
			stmt.execute();
			
			System.out.println(
					"Nome atualizado com sucesso!"
					);
		}else { 
			System.out.println(
				"Pessoa não encontrada"
				)
			;
		}
		
		
		conexao.close();
	}
}
