package streamapi;

import java.util.HashSet;
import java.util.Set;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ReduceExemplo2 {
	
	private static Set<Integer> getCojuntoNaturais(int max) {
		Set<Integer> conjunto = new HashSet<Integer>();
		
		for(int i = 0; i < max; i++) { conjunto.add(i); }
		
		return conjunto;
	}
	
	public static void main(String[] args) {
		
		Predicate<Integer> par = n -> n % 2 == 0;
		BinaryOperator<Integer> soma = (total, n) -> total + n;
		
		var conjunto = getCojuntoNaturais(100);
		
		System.out.println(conjunto);
		
		var paresSoma = conjunto.stream().filter(par).reduce(0, soma);
		var imparesSoma = conjunto.stream().filter(par).map(n -> n + 1)
												   .reduce(0, soma);
		
		System.out.println(paresSoma);
		System.out.println(imparesSoma);
		
	}
}
