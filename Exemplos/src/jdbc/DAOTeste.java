package jdbc;

public class DAOTeste {
	public static void main(String[] args) {
		DAO dao = new DAO();
		
		String sql = 
				"insert into pessoas (nome) values (?)"
				;
		
		dao.incluir(sql, "Piotr Cebula");
		dao.incluir(sql, "Pawel Kapusta");
		dao.incluir(sql, "Beato Salu");
		dao.incluir(sql, "Eddie Murphy");
		dao.incluir(sql, "Ace Ventura");
		dao.incluir(sql, "Nikola Tesla");
		
		System.out.println(
				"Registros inseridos com sucesso!"
				);
	}
}
