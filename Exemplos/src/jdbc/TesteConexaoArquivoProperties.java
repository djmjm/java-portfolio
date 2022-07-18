package jdbc;

import java.sql.Connection;
import java.sql.SQLException;

public class TesteConexaoArquivoProperties {
	public static void main(String[] args) throws SQLException {
		
		Connection conexao = FabricaConexao.
				getConexaoArquivoProperties()
				;
		System.out.println("Conexão efetuada com sucesso!!!");
		conexao.close();
	}
}
