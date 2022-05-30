package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class DesafioFilter2 {
	
	private static Consumer<Produto> imprimir = System.out::println;
	private static Predicate<Produto> descontoMin20 = p -> p.desconto > 20;
	private static Predicate<Produto> freteMax100 = p ->p.valorFrete <= 100;
	
	public static void main(String[] args) {
		
		List<Produto> produtos = Arrays.asList(
								new Produto(),
								new Produto("Notebook", 10, 30, 3999),
								new Produto("Geladeira", 315, 25, 5845.14),
								new Produto("Piano", 999, 5, 12000)
								);
		
		System.out.println();
		System.out.println("**** produtos disponíveis na loja ****".
				toUpperCase()
			  );
		System.out.println();
		produtos.stream().forEach(imprimir);
		
		System.out.println();
		System.out.println("**** escolha personalizada do cliente ****".
							toUpperCase()
						  );
		System.out.println();
		produtos.stream().filter(descontoMin20)
						 .filter(freteMax100)
						 .forEach(imprimir);
	}
}
