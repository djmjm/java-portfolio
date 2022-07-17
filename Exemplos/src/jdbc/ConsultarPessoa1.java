package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ConsultarPessoa1{
	public static void main(String[] args) 
			throws SQLException {
		Connection conexao =
				FabricaConexao.getConexao("java_exemplo_db")
				;
		String sql =
				"select * from pessoas"
				;
		Statement stmt = 
				conexao.createStatement()
				;
		ResultSet resultado =
				stmt.executeQuery(sql)
				;
		
		List<Pessoa> pessoas = 
				new ArrayList<>()
				;
		
		while( resultado.next() ) {
			int codigo = resultado.getInt("codigo");
			String nome = resultado.getString("nome");
			pessoas.add(new Pessoa(codigo, nome) );
		}
		stmt.close();
		conexao.close();
		
		for(Pessoa pessoa : pessoas) {
			System.out.println(pessoa);
		}
		
	}
}
