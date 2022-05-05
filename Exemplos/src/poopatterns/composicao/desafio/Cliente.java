package poopatterns.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

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
	
	@Override
	public String toString() {
		String strRetorno = "Nome do Cliente - " + nome;
		strRetorno += " | Número de Compras - " + compras.size();
		strRetorno += " | Total Gasto - R$" + totalGasto();
		return strRetorno;
	}
}
