package streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMaxExemplo {
	public static void main(String[] args) {
		
		Comparator<Produto> maisBarato = (p1, p2) -> {
			if(p1.preco > p2.preco) return 1;
			else return -1;
		};
		
		Comparator<Produto> maisCaro = (p1, p2) -> {
			if(p1.preco < p2.preco) return 1;
			else return -1;
		};
		
		List<Produto> produtos = Arrays.asList(
				new Produto(),
				new Produto("Notebook", 10, 30, 3999),
				new Produto("Geladeira", 315, 25, 5845.14),
				new Produto("Piano", 999, 5, 12000)
				);
		
		System.out.println(produtos.stream().min(maisBarato));
		System.out.println(produtos.stream().max(maisCaro));
		
		System.out.println(produtos.stream().max(maisBarato));
		System.out.println(produtos.stream().min(maisCaro));
	}
}
