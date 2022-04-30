package poo;

public class ClienteJantar extends Pessoa {
	private int peso;
	
	public ClienteJantar() {
		super();
		peso = 90;
	}
	
	public ClienteJantar(String nome) {
		super(nome);
		peso = 90;
	}
	
	public ClienteJantar(String nome, int peso) {
		super(nome);
		this.peso = peso;
	}
	
	public int getPeso() {
		return peso;
	}
	
	public void comer(Comida comida) {
		peso += comida.getPeso();
	}
}
