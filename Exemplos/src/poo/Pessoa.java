package poo;

public class Pessoa {
	private String nome;
	
	Pessoa() {
		nome = "Anônimo";
	}
	
	public void mudarNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome.toUpperCase();
	}
	
	public char getLetraInicial() {
		return nome.toLowerCase().charAt(0);
	}
}
