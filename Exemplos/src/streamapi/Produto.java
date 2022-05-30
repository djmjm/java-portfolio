package streamapi;

public class Produto {
	final String nome;
	final double valorFrete;
	final int desconto;
	final double preco;
	
	public Produto() {
		nome = "Produto Genérico";
		valorFrete = 100;
		desconto = 15;
		preco = 20.0;
	}
	
	public Produto(String nome,
				   double valorFrete,
				   int desconto,
				   double preco
				) {
		this.nome = "".concat(nome);
		this.valorFrete = valorFrete;
		this.desconto = desconto;
		this.preco = preco;
	}
	
	@Override
	public String toString() {
		double desconto = (double) this.desconto / 100;
						  desconto *= preco;
						  
		double precoComDesconto = preco - desconto;
		
		return nome.toUpperCase() + " ->> " + "\n" +
				"Desconto - R$" + (int) desconto + " | " +
				"Frete - R$" + (int) valorFrete + " | " +
				"Preço Final - R$" + (int)(precoComDesconto +
				valorFrete) + "\n" + "------------"
				;
	}
}
