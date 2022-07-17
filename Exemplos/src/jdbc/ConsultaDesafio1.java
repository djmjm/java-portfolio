package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ConsultaDesafio1 {
	public static void main(String[] args) 
			throws SQLException {
		
		List<Pessoa> pessoasTotal = 
				getListaPessoas(
						"select * from pessoas"
						); 
		
		List<Pessoa> pessoasFinalNomeSki = 
				getListaPessoas(
						"select * from pessoas "
						+ "where nome like '%ski'"
						); 
		
		System.out.println("TODAS PESSOAS:");
		for(Pessoa pessoa: pessoasTotal) {
			System.out.println(pessoa);
		}
		System.out.println();
		
		System.out.println("PESSOAS COM SKI NO FINAL DO NOME:");
		for(Pessoa pessoa: pessoasFinalNomeSki) {
			System.out.println(pessoa);
		}
		System.out.println();
	}
	
	private static 
	List <Pessoa> getListaPessoas(String sql)
			throws SQLException{
		Connection conexao =
				FabricaConexao.getConexao("java_exemplo_db")
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
		
		return pessoas;
	}
}
