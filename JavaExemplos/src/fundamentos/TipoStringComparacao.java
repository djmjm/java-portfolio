package fundamentos;

import java.util.Scanner;

public class TipoStringComparacao {
	public static void main(String[] args) {
		String string_1 = "string";
		String string_2 = new String("string");
		System.out.println(string_1 == string_2);
		System.out.println(string_1.equals(string_2));
		
		string_1 = "back     ";
		string_2 = "back";
		System.out.println(string_1.equals(string_2));
		System.out.println(string_1.trim().equals(string_2));
		
		Scanner leitor = new Scanner("My name is java");
		string_1 = leitor.next();
		string_2 = leitor.nextLine();
		System.out.println(string_1);
		System.out.println(string_2);
		System.out.println(string_1 + string_2);
		leitor.close();
		
	}
}
