package test;

import util.Name;

public class GetNamesLikeTest {
	public static void main(String[] args) {
		System.out.println(
				Name.getList("Person", "jo%")
		);
	}
}
