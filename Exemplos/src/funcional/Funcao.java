package funcional;

import java.util.function.Function;

public class Funcao {
	
	private static Function<Integer, String> checarPar = 
			numero -> numero % 2 == 0 ? "PAR" : "ÍMPAR";
			
	private static Function<Integer, Integer> dobrar =
			numero -> numero * 2;
					
	private static Function<Integer, Integer> triplicar =
			numero -> numero * 3;
	
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			System.out.println(i + " - ".concat(checarPar.apply(i)) );
			System.out.println(dobrar.apply(i) + 
					" - ".concat( checarPar.apply( dobrar.apply(i) ) ) );
			System.out.println(triplicar.apply(i) + 
					" - ".concat( checarPar.apply( triplicar.apply(i) ) ) );
			
			System.out.println();
		}
	}
}
