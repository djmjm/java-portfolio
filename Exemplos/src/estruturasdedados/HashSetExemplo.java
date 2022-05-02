package estruturasdedados;

import java.util.HashSet;

public class HashSetExemplo {
	public static void main(String[] args) {
		HashSet conjuntoHeterogeneo = new HashSet();
		
		conjuntoHeterogeneo.add(1.8);
		conjuntoHeterogeneo.add(true);
		conjuntoHeterogeneo.add(9);
		conjuntoHeterogeneo.add("Hello World");
		conjuntoHeterogeneo.add(new Object());
		
		System.out.println(conjuntoHeterogeneo);
		System.out.println();
		
		HashSet<Double> conjuntoNumeros = new HashSet<Double>();
		
		for(var iteracao: conjuntoHeterogeneo) {
			Double adicionado = 3.14159265;
			if(iteracao instanceof Double) adicionado = (Double) iteracao ;
			if(iteracao instanceof Integer) adicionado = ((Integer) iteracao).doubleValue() ;
			if(adicionado != 3.14159265) conjuntoNumeros.add(adicionado);
		}
		conjuntoNumeros.add(1983.0);
		
		System.out.println(conjuntoNumeros);
		System.out.println();
		
		conjuntoHeterogeneo.addAll(conjuntoNumeros);
		
		System.out.println(conjuntoHeterogeneo);
		System.out.println();
		
		conjuntoHeterogeneo.add(-55.8);
		conjuntoNumeros.remove(1.8);
		
		System.out.println(conjuntoHeterogeneo);
		System.out.println(conjuntoNumeros);
		System.out.println();
		
		conjuntoHeterogeneo.retainAll(conjuntoNumeros);
		
		System.out.println(conjuntoNumeros);
	}
}
