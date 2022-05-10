package poopatterns.heranca.abstrato;

public class AnimalAlimentoTeste {
	public static void main(String[] args) {
		Girafa girafa = new Girafa();
		Tigre tigre = new Tigre();
		Porco porco = new Porco();
		
		Alimento planta = Alimento.VEGETAL;
		Alimento carne = Alimento.CARNE;
		
		System.out.println( girafa.comer(planta) );
		System.out.println( girafa.comer(carne) );
		System.out.println();
		
		System.out.println( tigre.comer(planta) );
		System.out.println( tigre.comer(carne) );
		System.out.println();
		
		System.out.println( porco.comer(planta) );
		System.out.println( porco.comer(carne) );
		System.out.println();
		
		
	}
}
