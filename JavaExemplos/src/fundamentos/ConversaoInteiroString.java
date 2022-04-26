package fundamentos;

public class ConversaoInteiroString {
	public static void main(String[] args) {
		Integer inteiro = 314159265;
		
		System.out.println(
				"Exemplo 1 - "
				+ inteiro.toString()
				);
		
		System.out.println(
				"Exemplo 2 - "
				+ ("" + inteiro)
				);
	}
}
