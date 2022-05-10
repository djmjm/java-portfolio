package poopatterns.polimorfismo;

public class Pessoa {
	private double peso;
	
	public Pessoa() {
		this(78);
	}
	
	public Pessoa(int peso) {
		this.peso = peso;
	}
	
	public void comer(Comida comida) {
		this.peso += comida.getCalorias();
	}
	
	@Override
	public String toString() {
		return "Peso - " + (int)peso + "KGs";
	}
}
