package jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class FabricaConexao {
	public static Connection getConexao(String db_nome) {
		try {
		final String url = 
				"jdbc:mariadb://localhost:3306/"+ db_nome +"?"
				+ "verifyServerCertificate=false"
				+ "&"
				+"useSSL=false"
				;
		final String usuario =
				"root"
				;
		final String senha = "";
		
		return  DriverManager.
				getConnection(url, usuario, senha)
				;
		}
		catch( SQLException e ) {
			throw new RuntimeException(e);
		}

	}
	
	public static Connection getConexao() {
		return getConexao("");
	}
	
	public static Connection getConexao(boolean _default) {
		return getConexao("java_exemplo_db");
	}
	
	public static Connection getConexaoArquivoProperties() {
		try {
			Properties properties = 
					getProperties();
			final String url = 
					properties.getProperty("banco.url")
					;
			
			final String usuario =
					properties.getProperty("banco.usuario");
					;
			final String senha = 
					""
					// ---> properties.getProperty("banco.senha"); <---
					// apenas teste de banco sem senha ...
					// descomentar para carregar do arquivo!!
					;
			
			return  DriverManager.
					getConnection(url, usuario, senha)
					;
			}
			catch( SQLException 
					|
					IOException e
					) {
				throw new RuntimeException(e);
			}
	}
	
	private static Properties getProperties() 
	throws IOException{
		Properties properties = new Properties();
		String caminho = "conexao.properties";
		properties.load(FabricaConexao.
				class.getResourceAsStream(
						caminho
						)
				);
		return properties;
	}
}
