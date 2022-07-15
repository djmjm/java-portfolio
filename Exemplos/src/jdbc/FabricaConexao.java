package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaConexao {
	public static Connection getConexao() {
		try {
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
		
		return  DriverManager.
				getConnection(url, usuario, senha)
				;
		}
		catch( SQLException e ) {
			throw new RuntimeException(e);
		}

	}
}
