package poopatterns.composicao.desafio;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Cliente {
	private final String nome;
	private final List<Compra> compras = new ArrayList<Compra>();
	
	public Cliente() {
		this("Anônimo");
	}
	
	public Cliente(String nome) {
		this.nome = nome.toUpperCase();
	}
	
	public void comprar(List<Item> itens) {
		Compra compra = new Compra(this, itens);
		compras.add(compra);
	}
	
	public void comprar(Item item) {
		List<Item> itens = new ArrayList<Item>();
		itens.add(item);
		Compra compra = new Compra(this, itens);
		compras.add(compra);
	}
	
	public String getNome() {
		return nome;
	}
	
	private double totalGasto() {
		double total = 0;
		for(Compra compra: compras) {
			total += compra.getCustoTotal();
		}
		return total;
	}
	
	public List<Compra> getListaCompras(){
		return compras;
	}
	
	public Set<String> getNomesItensComprados(){
		Set<String> nomes = new HashSet<String>();
		
		for(Compra compra : compras) {
			for(String nome : compra.getListaItemsNome()) {
				nomes.add(nome);
			}
		}
		
		return nomes;
	}
	
	@Override
	public String toString() {
		String strRetorno = "Nome do Cliente - " + nome;
		strRetorno += " | Número de Compras - " + compras.size();
		strRetorno += " | Total Gasto - R$" + totalGasto();
		return strRetorno;
	}
}
