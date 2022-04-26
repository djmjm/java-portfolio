package fundamentos;

public class MathExemplo {
	public static void main(String[] args) {
		
		final int numero = 2;
		final int potencia = 10;
		
		for(int i = 0; i <= potencia; i++) {
			System.out.println(
					(int) Math.pow(numero, i)
					);
		}
	}
}
