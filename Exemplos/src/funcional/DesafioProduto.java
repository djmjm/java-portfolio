//AINDA NÃO FINALIZADO!!!!

package funcional;

import java.util.function.Function;
import java.util.function.UnaryOperator;

import poopatterns.composicao.desafio.Produto;

public class DesafioProduto {
	
	private static UnaryOperator<Double> desconto10 = 
			x -> x - (x * 0.10);
	private static UnaryOperator<Double> desconto15 = 
			x -> x - (x * 0.15);
	private static UnaryOperator<Double> desconto20 = 
			x -> x - (x * 0.20);
	
	private static Function<Double, Double> impostoMunicipal = 
			x -> x >= 2500 ? x - (x * 0.085)
				   : x
				   ;
	
	private static Function<Double, Double> frete =
			x -> x >= 3000 ? 100.0 : 50.0;
			
	public static void main(String[] args) {
		Produto produto1 = new Produto("Teste", 3.14156592);
		
		System.out.println(produto1);
		
		//SERA CORRIGIDO
		//DESAFIO (AINDA) NAO FINALIZADO
	}
}
