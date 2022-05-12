package funcional;

public class CalculoExemplo {
	public static void main(String[] args) {
		Calculo adicao = (x, y) -> x + y;
		Calculo subtracao = (x, y) -> x - y;
		Calculo multiplicacao = (x, y) -> x * y;
		Calculo divisao = (x, y) -> x / y;
		
		System.out.println( adicao.calcular(1, 2) );
		System.out.println( subtracao.calcular(1, 2) );
		System.out.println( multiplicacao.calcular(1, 2) );
		System.out.println( divisao.calcular(1, 2) );
	}
}
