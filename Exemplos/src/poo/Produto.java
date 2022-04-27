package poo;

public class Produto {
	private String nome;
	private double valor;
	private double desconto;
	
	public Produto() {
		nome = "Produto Genérico";
		valor = 1.99;
		desconto = 0.0;
	}
	
	public Produto(String nome, double valor, double desconto) {
		this.nome = nome;
		this.valor = valor;
		this.desconto = desconto;
	}
	
	public double calcularDesconto() {
		return valor - desconto;
	}
	
	public double calcularDesconto(double acrescimo) {
		return valor - (desconto + acrescimo);
	}
	
	public double getValor() {
		return valor;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getDesconto() {
		return desconto;
	}
}
