package poopatterns.composicao;

public class CarroTeste {
	public static void main(String[] args) {
		Carro carro = new Carro();
		
		System.out.println(carro.getRPM());
		
		carro.acelerar();
		System.out.println(carro.getRPM());
		
		carro.ligar();
		carro.acelerar();
		System.out.println(carro.getRPM());
		
		for(int i = 0; i < 10; i++) {
			carro.acelerar();
			System.out.println(carro.getRPM());
		}
		
		for(int i = 0; i < 10; i++) {
			carro.frear();
			System.out.println(carro.getRPM());
		}
		
		System.out.println(carro.getRPM());
		carro.desligar();
		System.out.println(carro.getRPM());
		
	}
}
