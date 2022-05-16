package funcional;

import java.util.function.Predicate;

public class PredicadoComposicaoExemplo {
	
	private static Predicate<Integer> umDigito = 
			numero -> numero < 10;
	
	private static Predicate<Integer> doisDigitos = 
			numero -> numero < 100 && !umDigito.test(numero);
			
	private static Predicate<Integer> tresOuMaisDigitos = 
			numero -> !(
					  doisDigitos.test(numero) || 
					  umDigito.test(numero)
					  );
	
	public static void main(String[] args) {
		final int um = 1;
		final int dez = 10;
		final int cem = 100;
		
		System.out.println(umDigito.test(um));
		System.out.println(doisDigitos.test(um));
		System.out.println(tresOuMaisDigitos.test(um));
		System.out.println();
		
		System.out.println(umDigito.test(dez));
		System.out.println(doisDigitos.test(dez));
		System.out.println(tresOuMaisDigitos.test(dez));
		System.out.println();
		
		System.out.println(umDigito.test(cem));
		System.out.println(doisDigitos.test(cem));
		System.out.println(tresOuMaisDigitos.test(cem));
		System.out.println();
	}
}
