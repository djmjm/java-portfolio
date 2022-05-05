package poopatterns.composicao;

import java.util.ArrayList;

public class Compra {
	private String cliente;
	private ArrayList<Item> itens = new ArrayList<Item>();
	
	public Compra() {
		cliente = "Cliente 1";
	}
	
	public Compra(String cliente) {
		this.cliente = cliente;
	}
	
	public ArrayList<Item> getListaItens() {
		return itens;
	}
	
	public String getCliente() {
		return cliente;
	}
	
	public void addItem(Item item) {
		itens.add(new Item(item, this));
	}
	
	public double getValorTotal() {
		double valorTotal = 0;
		for(Item item: this.getListaItens()) {
			valorTotal += item.getPreco();	
		}
		
		return valorTotal;
	}
}
