package poopatterns.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Produto {
	private final String nome;
	private final double preco;
	private final List<Item> itens = new ArrayList<Item>();
	
	public Produto() {
		this("genérico", 1.99);
	}
	
	public Produto(String nome, double preco) {
		this.nome = nome.toLowerCase();
		this.preco = preco;
	}
	
	public void vincularItem(Item item) {
		if(!itens.contains(item)) {
			itens.add(item);
		}
	}
	
	private int getQuantidadeVendida() {
		int total = 0;
		for(Item item: itens) {
			total += item.getQuantidade();
		}
		return total;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public String getNome() {
		return nome;
	}
	
	@Override
	public String toString() {
		return new String(
					"Produto - " +
					nome + " | Preço - R$" +
					preco + " | Vezes que foi comprado - " +
					itens.size() + " | Quantidade vendida - " +
					getQuantidadeVendida()
				);
	}
}
