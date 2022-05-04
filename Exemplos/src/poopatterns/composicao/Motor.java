package poopatterns.composicao;

public class Motor {
	private final Carro carro;
	
	public double fatorInjecao = 1;
	public boolean ligado = false;
	
	public Motor(Carro carro) {
		this.carro = carro;
	}
	
	int giros() {
		if(!ligado) {
			return 0;
		}else {
			return (int) Math.round(fatorInjecao * 3000);
		}
	}
}
