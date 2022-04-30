package poo;

public class Produto {
	private String nome;
	private double valor;
	private double desconto_produto;
	private static final double desconto_loja = 0.99;
	
	public Produto() {
		nome = "Produto Genérico";
		valor = 1.99;
		desconto_produto = 0.0;
	}
	
	public Produto(String nome, double valor, double desconto_produto) {
		this.nome = nome;
		this.valor = valor;
		this.desconto_produto = desconto_produto;
	}
	
	public double calcularDesconto() {
		var resultado = valor - desconto_produto - desconto_loja;
		return Math.max(resultado, 0);
	}
	
	public double calcularDesconto(double acrescimo) {
		var resultado = valor - (desconto_produto + acrescimo + desconto_loja);
		return Math.max(resultado, 0);
	}
	
	public double getValor() {
		return valor;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getDesconto() {
		return desconto_produto + desconto_loja;
	}
}
