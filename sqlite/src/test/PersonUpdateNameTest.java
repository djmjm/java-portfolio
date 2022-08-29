package test;

import model.Person;

public class PersonUpdateNameTest {
	public static void main(String[] args) {
		Person person  = 
				new Person(3695841, 
						"Antes", "14725836914"
				);
		person.setName("depois");
	}
}
