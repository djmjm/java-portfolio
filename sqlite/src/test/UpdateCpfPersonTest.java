package test;

import model.Person;

public class UpdateCpfPersonTest {
	public static void main(String[] args) {
		Person query1 = new Person(111);
		
		System.out.println(query1.getName());
		System.out.println(query1.getCpf());
		
		query1.setCpf("99988877744");
		
		Person query2 = new Person(111);
		System.out.println(query2.getCpf());
		query2.setCpf("12345678912");
	}
}
