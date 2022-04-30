package poo;

public class Comida {
	String nome;
	int peso;
	
	public Comida() {
		nome = "Churrasco";
		peso = 100;
	}
	
	public Comida(String nome, int peso) {
		this.nome = nome;
		this.peso = peso;
	}
	
	public String getNome() {
		return nome.toLowerCase();
	}
	
	public int getPeso() {
		return peso;
	}
}
