package Model;

import util.Table;

public class Pessoa {
	
	private long id;
	private String name;
	private String cpf;
	
	public Pessoa(){
		id = 1983;
		name = "Nome";
		cpf = "12345678912";
	}
	
	public static void createTableDB() {
		String tableName = "Pessoa";
		
		String sqlCollumnId = "( id int auto_increment primary key, ";
		String sqlCollumnName = " name varchar(80) not null, ";
		String sqlCollumnCpf = " cpf varchar(11) not null )";
		
		String sqlCollumns = sqlCollumnId +
							 sqlCollumnName +
							 sqlCollumnCpf
							 ;
		
		Table.create(tableName, sqlCollumns);
		System.out.println("OK!");
		
	}
}
