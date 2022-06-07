package fundamentos;

/** retirando warnings (apenas exemplo para estudo) **/
@SuppressWarnings({ "all", "unused"})

public class OperadoresRelacionais {
	public static void main(String[] args) {
		final int numero = 1;
		boolean condicao_1 = (numero >= 1) ;
		boolean condicao_2 = (numero <= 1) ;
		boolean condicao_3 = (numero == 1) ;
		boolean condicao_4 = (numero == numero / numero) ;
		
		boolean resultado = 
				condicao_1 &&
				condicao_2 &&
				condicao_3 &&
				condicao_4;
		
		System.out.println(resultado);
	}
}
