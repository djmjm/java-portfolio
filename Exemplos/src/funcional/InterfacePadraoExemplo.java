package funcional;

import java.util.function.BinaryOperator;

public class InterfacePadraoExemplo {
	
	public static BinaryOperator<Integer> soma = (x, y) -> x + y;
	
	public static void main(String[] args) {
		
		System.out.println(soma.apply(1, 1));
		
		System.out.println(multiplicar(5, 5));
		
		var v16 = multiplicar(2,
									multiplicar(2, 
										multiplicar(
											2, 2
										)
									)
								);
		System.out.println(v16);
		
		int v1024 = 1;
		
		for(int i = 0; i < 10; i++) {
			v1024 = multiplicar(v1024, 2);
		}
		
		System.out.println(v1024);
	}
	
	public static int multiplicar(int x, int y) {
		int operandoSoma = Math.max(x, y);
		int quantidadeSomas = Math.min(x, y);
		int resultado = 0;
		
		for(int i = 0; i < quantidadeSomas; i++) {
			resultado = soma.apply(resultado, operandoSoma);
		}
		
		return resultado;
		
	}
}
