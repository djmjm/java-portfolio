package poopatterns.polimorfismo;

public class Comida {
	private double calorias;
	
	public Comida() {
		this(120);
	}
	
	public Comida(int calorias) {
		this.calorias = Math.max(0, calorias);
	}
	
	public double getCalorias() {
		return calorias / 1000;
	}
}
