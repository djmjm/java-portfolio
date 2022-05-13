package poopatterns.composicao.desafio;

public class Item {
	private final int quantidade;
	private final Produto produto;
	
	public Item(Produto produto, int quantidade) {
		this.quantidade = quantidade;
		this.produto = produto;
		produto.vincularItem(this);
	}
	
	public double getTotalPreco() {
		return produto.getPreco() * quantidade;
	}
	
	public double getQuantidade() {
		return quantidade;
	}
	
	public String getNomeProduto() {
		return produto.getNome();
	}
	
	@Override
	public String toString() {
		return new String(
					"Item:"
					+ "\n"
					+ produto.toString()
					+ "\n"
					+ "Quantidade - " + quantidade
				);
				
	}
	
}
