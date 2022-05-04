package poopatterns.composicao;

public class Carro {
	private final Motor motor;
	
	public Carro() {
		motor = new Motor(this);
	}
	
	public int getRPM() {
		return motor.giros();
	}
	
	public void acelerar() {
		if(motor.ligado) {
			if(motor.fatorInjecao < 2.6) {
				motor.fatorInjecao += 0.4;
			}
		}
	}
	
	public void frear() {
		if(motor.ligado) {
			if(motor.fatorInjecao > 0.5) {
				motor.fatorInjecao -= 0.4;
			}
		}
	}
	
	public void desligar() {
		motor.ligado = false;
	}
	
	public void ligar() {
		motor.ligado = true;
	}
}
