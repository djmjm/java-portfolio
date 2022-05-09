package poopatterns.composicao;

public class Carro {
	private final Motor motor;
	private final int velocidadeMaxima;
	private final double fatorFreio;
	private final double fatorAceleracao;
	private double velocidade = 0;
	
	public Carro() {
		motor = new Motor(this);
		velocidadeMaxima = 100;
		fatorFreio = 0.4;
		fatorAceleracao = 0.4;
	}
	
	public Carro(
			int velocidadeMaxima,
			double fatorFreio,
			double fatorAceleracao
			) {
		
		motor = new Motor(this);
		this.velocidadeMaxima = velocidadeMaxima;
		this.fatorFreio = Math.max(fatorFreio, 1.1);
		this.fatorAceleracao = fatorFreio;
	}
	
	public int getVelocidadeMaxima() {
		return velocidadeMaxima;
	}
	
	public int getVelocidadeAtual() {
		return (int) velocidade;
	}
	
	public int getRPM() {
		return motor.giros();
	}
	
	public void acelerar() {
		if(motor.ligado) {
			if(motor.fatorInjecao < 2.6) {
				motor.fatorInjecao += fatorAceleracao;
				motor.fatorInjecao = Math.min(2.6, motor.fatorInjecao);
			}
			velocidade += (1 + velocidade) * fatorAceleracao;
			velocidade = Math.round(Math.min(velocidadeMaxima, velocidade));
		}
	}
	
	public void frear() {
		if(motor.ligado) {
			if(motor.fatorInjecao > 0.4) {
				motor.fatorInjecao -= fatorFreio;
				motor.fatorInjecao = Math.max(0, motor.fatorInjecao);
			}
			velocidade = velocidade / fatorFreio;
			velocidade = Math.round(velocidade);
			if(velocidade <= 1) velocidade = 0;
		}
	}
	
	public boolean estaNaVelocidadeMaxima() {
		return velocidade == velocidadeMaxima;
	}
	
	public boolean estaParado() {
		return velocidade == 0;
	}
	
	public boolean estaLigado() {
		return motor.ligado;
	}
	
	public void desligar() {
		motor.ligado = false;
	}
	
	public void ligar() {
		motor.ligado = true;
	}
	
	@Override
	public String toString() {
		String ligadoStr = motor.ligado ? "Ligado" : "Desligado";
		
		return "velocidade - " + velocidade + "KMs/H"
				+ " || " + 
				"RPM - " + getRPM()
				+ " || " + 
				ligadoStr;
	}
}
