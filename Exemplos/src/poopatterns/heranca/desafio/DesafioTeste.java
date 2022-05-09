package poopatterns.heranca.desafio;

public class DesafioTeste {
	public static void main(String[] args) {
		Ferrari ferrari = new Ferrari();
		Fusca fusca = new Fusca();
		
		System.out.println();
		System.out.println(" ==> TESTE ACELERAÇÃO <==");
		System.out.println();
		
		System.out.println(ferrari);
		System.out.println(fusca);
		System.out.println();
		
		do {
			ferrari.acelerar();
			fusca.acelerar();
			System.out.println(ferrari);
			System.out.println(fusca);
			System.out.println();
			
			if(!ferrari.estaLigado()) {
				ferrari.ligar();
			}
			
			if(!fusca.estaLigado()) {
				fusca.ligar();
			}
			
			if(ferrari.estaNaVelocidadeMaxima()) {
				System.out.println("Ferrari ganhou!!!");
				break;
			}
			
			if(fusca.estaNaVelocidadeMaxima()) {
				System.out.println("Fusca ganhou!!!");
				break;
			}
			
		}while(true);
		
		System.out.println();
		System.out.println(" ==> TESTE FRENAGEM <==");
		System.out.println();
		
		do {
			ferrari.frear();
			fusca.frear();
			System.out.println(ferrari);
			System.out.println(fusca);
			System.out.println();
			
			if(!ferrari.estaLigado()) {
				System.out.println("Ferrari ganhou!!!");
				break;
			}
			
			if(!fusca.estaLigado()) {
				System.out.println("Fusca ganhou!!!");
				break;
			}
			
			if(ferrari.estaParado()) {
				ferrari.desligar();
			}
			
			if(fusca.estaParado()) {
				fusca.desligar();
			}
			
		}while(true);
	}
}
