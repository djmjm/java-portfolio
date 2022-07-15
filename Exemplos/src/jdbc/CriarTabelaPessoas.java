package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarTabelaPessoas {
	public static void main( String[] args ) 
	throws SQLException {
		String db_nome = "java_exemplo_db";
		Connection conexao = FabricaConexao.getConexao(db_nome);
		
		String sql = "create table if not exists pessoas ("
					+"codigo int auto_increment primary key,"
					+"nome varchar(80) not null"
					+")";
		
		Statement stmt = conexao.createStatement();
		stmt.execute(sql);
		
		System.out.println("Tabela criada com sucesso!");
		conexao.close();
	}
}
