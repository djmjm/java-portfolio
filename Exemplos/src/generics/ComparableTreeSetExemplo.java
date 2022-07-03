package generics;

import java.util.TreeSet;

public class ComparableTreeSetExemplo {
	public static void main(String[] args) {
		TreeSet<Integer> conjuntoInteiros = new TreeSet<>();
		
		conjuntoInteiros.add(-1);
		conjuntoInteiros.add(-1983);
		conjuntoInteiros.add(-1903);
		conjuntoInteiros.add(-1995);
		conjuntoInteiros.add(-2017);
		conjuntoInteiros.add(-2001);
		
		for(Integer numero : conjuntoInteiros) {
			System.out.println(numero);
		}
	}
}
