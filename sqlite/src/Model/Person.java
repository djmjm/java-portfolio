package model;

import java.util.List;

import util.Name;
import util.Table;

public class Person {
	
	private long id;
	private String name;
	private String cpf;
	
	private static final 
	String tableNameDB = "Person";
	
	public Person(){
		id = 1983;
		name = "Nome";
		cpf = "12345678912";
		insertTableDB();
	}
	
	public Person
	(long id, String name, String cpf){
		this.id = id;
		this.name = name;
		this.cpf = cpf;
		insertTableDB();
	}
	
	private void insertTableDB() {
		String tableName = tableNameDB;
		String collumns = "(id, name, cpf)";
		String values = 
				"(" + id +", '" + name + "', '" + cpf + "')";
		
		Table.insert(tableName, collumns, values);
	}
	
	public static void createTableDB() {
		String tableName = tableNameDB;
		
		String sqlCollumnId = "( id int auto_increment primary key not null, ";
		String sqlCollumnName = " name varchar(80) not null, ";
		String sqlCollumnCpf = " cpf varchar(11) not null )";
		
		String sqlCollumns = sqlCollumnId +
							 sqlCollumnName +
							 sqlCollumnCpf
							 ;
		
		Table.create(tableName, sqlCollumns);
		System.out.println("OK!");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		
		String setChange = "set name='" + name + "'";
		Table.update(tableNameDB, id, setChange);
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public static List<String> getAllNamesDB() {
		return Name.getList(tableNameDB);
	}
}
