package fundamentos;

public class OperadoresLogicos {
	public static void main(String[] args) {
		boolean valor_logico_1 = Boolean.parseBoolean("true");
		boolean valor_logico_2 = 9999 > 9999;
		
		System.out.println(valor_logico_1 && valor_logico_2);
		System.out.println(valor_logico_1 || valor_logico_2);
		System.out.println(valor_logico_1 ^ valor_logico_2);
		System.out.println(valor_logico_1 ^ !valor_logico_2);
		
	}
}
