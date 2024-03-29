package model;

import java.util.Arrays;
import java.util.List;

import util.CPF;
import util.Name;
import util.Table;

public class Person {
	
	private long id;
	private String name;
	private String cpf;
	private Double budget;
	
	private static final 
	String tableNameDB = "Person";
	
	private static final
		List<String> collumnNames = 
			Arrays.asList("name", "cpf"); 
	
	private void insertTableDB() {
		String tableName = tableNameDB;
		String collumns = "(id, name, cpf, budget)";
		String values = 
				"(" + id +", '" + name + "', '" 
					+ cpf + "', '" 
					+ budget + "')";
		
		Table.insert(tableName, collumns, values);
	}
	
	private void loadPerson(long id) {
		Object result = Table.get(tableNameDB, id, collumnNames);
		
		if(Table.isValidQuery(result)) {
			List<String> resultList = (List) result;
			
			this.id = id;
			this.name = resultList.get(0);
			this.cpf = resultList.get(1);
			
		}
		else {
			System.out.println("Pessoa não encontrada...");
		}
	}
	
	public Person(){
		id = 1983;
		name = "Nome";
		cpf = "12345678912";
		budget = (Double) 1111.0;
		insertTableDB();
	}
	
	public Person(long id) {
		loadPerson(id);
	}
	
	public Person
	(long id, String name, String cpf){
		this.id = id;
		this.name = name;
		this.cpf = cpf;
		this.budget = (Double) 11111.0;
		
		insertTableDB();
	}
	
	public Person
	(long id, String name, String cpf, Double budget){
		this.id = id;
		this.name = name;
		this.cpf = cpf;
		this.budget = budget;
		
		insertTableDB();
	}
	
	public static void createTableDB() {
		String tableName = tableNameDB;
		
		String sqlCollumnId = "( id int auto_increment primary key not null, ";
		String sqlCollumnName = " name varchar(80) not null, ";
		String sqlCollumnCpf = " cpf varchar(11) not null, ";
		String sqlCollumnBudget = " budget varchar(11) not null )";
		
		String sqlCollumns = sqlCollumnId +
							 sqlCollumnName +
							 sqlCollumnCpf +
							 sqlCollumnBudget
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
		
		String setChange = "set cpf='" + cpf + "'";
		Table.update(tableNameDB, id, setChange);
	}

	public static List<String> getAllNamesDB() {
		return Name.getList(tableNameDB);
	}
	
	public static List<String> getAllCPFDB() {
		return CPF.getList(tableNameDB);
	}
	
	public static void dropTable() {
		Table.drop(tableNameDB);
	}
}
