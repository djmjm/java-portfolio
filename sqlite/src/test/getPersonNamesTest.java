package test;

import java.util.function.Predicate;

import model.Person;

public class getPersonNamesTest {
	public static void main(String[] args) {
		
		Predicate<String> FirstLetter =
				word -> word.matches("João|José");
		
		System.out.println(
					Person.getAllNamesDB().
					stream().filter(FirstLetter).toList()
				);
	}
}
