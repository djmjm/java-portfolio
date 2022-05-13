package poopatterns.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class DesafioTeste {
	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente();
		Cliente cliente2 = new Cliente("Douglas");
		Cliente cliente3 = new Cliente("Pedro");
		
		Produto produto1 = new Produto();
		Produto produto2 = new Produto("Pão", 0.50);
		Produto produto3 = new Produto("Mortadela", 2.50);
		Produto produto4 = new Produto("Queijo", 3.75);
		Produto produto5 = new Produto("Balas", 0.25);
		
		List<Item> carrinho = new ArrayList<Item>();
		
		carrinho.add(new Item(produto1, 5));
		carrinho.add(new Item(produto5, 12));
		cliente1.comprar(carrinho);
		
        carrinho = new ArrayList<Item>();
		
		carrinho.add(new Item(produto2, 10));
		carrinho.add(new Item(produto3, 1));
		carrinho.add(new Item(produto4, 1));
		cliente2.comprar(carrinho);
		
		carrinho = new ArrayList<Item>();
		
		carrinho.add(new Item(produto2, 6));
		carrinho.add(new Item(produto3, 1));
		carrinho.add(new Item(produto5, 30));
		cliente3.comprar(carrinho);
		
		carrinho = new ArrayList<Item>();
		
		carrinho.add(new Item(produto1, 19));
		carrinho.add(new Item(produto5, 2));
		cliente2.comprar(carrinho);
		
		System.out.println(cliente1);
		System.out.println(cliente2);
		System.out.println(cliente3);
		System.out.println();
		
		System.out.println(produto1);
		System.out.println(produto2);
		System.out.println(produto3);
		System.out.println(produto4);
		System.out.println(produto5);
		System.out.println();
		
	}
}
