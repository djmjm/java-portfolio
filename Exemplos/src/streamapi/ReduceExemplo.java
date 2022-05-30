package streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;

public class ReduceExemplo {
	private static List<Integer> getSequenciaFibonacci(int n) {
		List<Integer> fibo = new  ArrayList<Integer>();
		
		Integer anterior = 0;
		Integer proximo = 1;
		
		do {
			fibo.add(anterior);
			
			Integer temp = proximo;
			proximo += anterior;
			anterior = temp;
			
		}while(--n > 0);
		
		
		return fibo;
	}
	
	public static void main(String[] args) {
		
		List<Integer> fibo = getSequenciaFibonacci(10);
		
		BinaryOperator<Integer> soma = (total, num)
									-> total + num;
		System.out.println("SEQUENCIA GERADA:");
		System.out.println(fibo);
		
		System.out.println("ULTIMO NUMERO:");
		System.out.println(fibo.get( fibo.size() - 1 ));
		
		Integer resultado = fibo.stream().reduce(0, soma);
		
		System.out.println("SOMATORIO SEQUENCIA:");
		System.out.println(resultado);
	}
}
