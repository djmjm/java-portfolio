package poopatterns.polimorfismo;

public class Jantar {
	public static void main(String[] args) {
		Pessoa jantante = new Pessoa();
		System.out.println(jantante);
		
		jantante.comer(new Arroz());
		jantante.comer(new Feijao());
		jantante.comer(new Arroz());
		jantante.comer(new Feijao());
		jantante.comer(new Arroz());
		jantante.comer(new Feijao());
		jantante.comer(new Arroz());
		jantante.comer(new Feijao());
		jantante.comer(new Arroz());
		jantante.comer(new Feijao());
		
		System.out.println(jantante);
		
		for(int i = 0; i < 100; i++) {
			jantante.comer(new Sorvete());
		}
		
		System.out.println(jantante);
		
	}
}
