package poopatterns.composicao;

import java.util.ArrayList;

public class Item {
	
	private String nome;
	private double preco;
	private int quantidade;
	private final Compra compra;
	
	public Item() {
		nome = "Item genérico";
		preco = 1.99;
		quantidade = 1;
		compra = null;
	}
	
	public Item(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
		compra = null;
	}
	
	public Item(Item item, Compra compra) {
		this.compra = compra;
		
		nome = item.nome;
		preco = item.preco;
		quantidade = item.quantidade;
		
	}
	
	public ArrayList getArrayAtributos() {
		ArrayList listaRetornada = new ArrayList();
		listaRetornada.add(nome);
		listaRetornada.add(preco);
		listaRetornada.add(quantidade);
		
		return listaRetornada;
	}
	
	public double getPreco() {
		return preco;
	}
}
