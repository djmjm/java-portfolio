package funcional;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

/** retirando warnings (apenas exemplo para estudo) **/
@SuppressWarnings({ "all", "unused"})

public class BiFuncaoExemplo {
	
	private static BinaryOperator<Double> media = 
					(n, m) -> (n + m) / 2;
					
	private static BiFunction<Double, Double, Boolean> aprovado = 
					(n, m) -> media.apply(n, m) > 7.0;
					
	private static Function<Boolean, String> mensagem = 
					value -> value ? "APROVADO" : "REPROVADO";
				
	
	public static void main(String[] args) {
		Queue<Double> provaPrimeira = new LinkedList();
		Deque<Double> provaSegunda = new ArrayDeque();
		
		for(double i = 1.0; i <= 10.0; i++) {
			provaPrimeira.offer(i);
			provaSegunda.push(i);
		}
		
		boolean existemMaisNotas = !(provaPrimeira.isEmpty()
							   	   && provaSegunda.isEmpty());
		while(existemMaisNotas) {
			
			Double nota1 = provaPrimeira.poll();
			Double nota2 = provaSegunda.pop();
			
			System.out.println("MEDIA - " + nota1 + "|" + nota2 +
							   " -> " +
							   media.apply(nota1, nota2)
							   + " = " + mensagem.apply(
									   		aprovado.apply(nota1, nota2)
									   )
							);
			
			existemMaisNotas = !(provaPrimeira.isEmpty()
				   	   		   && provaSegunda.isEmpty());
		}
	}
}
