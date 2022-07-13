package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaTeste {
	public static void main(String[] args) {
		List<String> linguagens = 
				Arrays.asList("Java","PHP","C","C++");
		
		List<Integer> inteiros = 
				Arrays.asList(1, 2, 3, 4, 5);
		
		var ultimaLinguagem = new Lista().getUltimo(linguagens);
		var ultimoNumero = new Lista().getUltimo(inteiros);
		
		System.out.println(ultimaLinguagem);
		System.out.println(ultimoNumero); 
		
		linguagens.set(linguagens.size() - 1, "Cobol");
		
		ultimaLinguagem = new Lista().getUltimo(linguagens);
		System.out.println(ultimaLinguagem);
												
	}
}
