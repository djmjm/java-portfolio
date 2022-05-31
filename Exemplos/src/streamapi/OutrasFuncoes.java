package streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class OutrasFuncoes {
	
	private static Consumer<Integer> imprimir = System.out::println;
	
	private static int calcularFatorial(int n) {
		if(n == 1 || n == 0) return 1;
		if(n < 0) return 0;
		
		n *= calcularFatorial(--n);
		
		return n;
	}
	
	public static void main(String[] args) {
		
		List<Integer> resultadosFatorial = new ArrayList<Integer>();

		for(int i = 1; i <= 10; i++) {
			resultadosFatorial.add( calcularFatorial(i) );
			resultadosFatorial.add( calcularFatorial(i) );
		}
		
		resultadosFatorial.stream().skip(10)
								   .distinct()
								   .forEach(imprimir);
		
		resultadosFatorial.stream().takeWhile(n -> n < 9999)
								   .forEach(imprimir);
		
		resultadosFatorial.stream().limit(5)
		   					       .forEach(imprimir);
	}
}
