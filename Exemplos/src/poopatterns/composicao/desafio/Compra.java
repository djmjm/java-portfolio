package poopatterns.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	
	private Cliente cliente;
	private double custoTotal;
	private final List<Item> itens = new ArrayList<Item>();
	
	public Compra(Cliente cliente, List<Item> itens) {
		this.cliente = cliente;
		custoTotal = 0;
		
		for(Item item: itens) {
			this.itens.add(item);
			custoTotal += item.getTotalPreco();
		}
	}
	
	public List<Item> getListaItems(){
		return itens;
	}
	
	public List<String> getListaItemsNome(){
		List<String> itens = new ArrayList<String>();
		
		for(Item item : this.itens) {
			var nome = item.getNomeProduto();
			if( !itens.contains(nome) ) {
				itens.add(nome);
			}
		}
		
		return itens;
	}
	
	public double getCustoTotal() {
		return custoTotal;
	}
	
	@Override
	public String toString() {
		return new String(
					"Cliente - " + cliente + " | " + itens
				);
				
	}
}
