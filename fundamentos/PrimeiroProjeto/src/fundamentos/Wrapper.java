package fundamentos;

public class Wrapper {
	public static void main(String[] args) {
		Integer inteiro = 3333;
		Double ponto_flutuante = 3.14159265;
		Boolean booleano = true && true || false;
		String quebra_linha = "\n";
		
		System.out.println(
				inteiro + quebra_linha +
				ponto_flutuante + quebra_linha +
				booleano
				);
	}
}
