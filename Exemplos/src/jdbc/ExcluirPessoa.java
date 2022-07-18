package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ExcluirPessoa {
	public static void main(String[] args) 
	throws SQLException{
		int id = 1;
		
		Connection conexao = 
				FabricaConexao.getConexao(true);
		
		String sql = "delete from pessoas where "
					+"codigo = ?"
				;
		
		PreparedStatement stmt = 
				conexao.prepareStatement(sql);
		stmt.setInt(1, id);
		
		if(stmt.executeUpdate() > 0) {
			System.out.println("Registro excluído com sucesso!");
		}else {
			System.out.println("Registro não encontrado.");
		}
		
		conexao.close();
	}
}
