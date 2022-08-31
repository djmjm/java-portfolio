package test;

import model.Person;

public class LoadPersonTest {
	public static void main(String[] args) {
		Person person = new Person(111);
		
		System.out.println(person.getName());
		System.out.println(person.getCpf());
		
		person = new Person(1111);
		
		System.out.println(person.getName());
		System.out.println(person.getCpf());
	}
}
