package funcional;

import java.util.List;
import java.util.Arrays;

public class ReferenciaMetodoExemplo {
	public static void main(String[] args) {
		List<Integer> conjuntoInteiros = Arrays.asList(1, 2, 55, 189, 77);
		
		conjuntoInteiros.forEach(numero -> System.out.println(contar(numero)));
	}
	
	public static int contar(int numero) {
		if(numero == 0) return 0;
		else return 1 + contar(--numero); 
	}
}
