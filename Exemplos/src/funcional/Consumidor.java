package funcional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import poopatterns.composicao.desafio.Produto;

public class Consumidor {

		private static Consumer<Produto> imprimirNome = 
				p -> System.err.println(p.getNome().toUpperCase());
	
		public static void main(String[] args) {
			Produto generico = new Produto();
			imprimirNome.accept(generico);
			
			List<Produto> listaProdutos = Arrays.asList(
											new Produto("café", 8.88),
											new Produto("caneta", 1.99),
											new Produto("papel", 5.47),
											new Produto("lapis", 1.51),
											new Produto("borracha", 0.99)
											);
			
			listaProdutos.forEach(imprimirNome);					
		}
}
