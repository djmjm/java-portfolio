package poopatterns.heranca.abstrato;

public class AnimalObjetoTeste {
	public static void main(String[] args) {
		Girafa serVivo = new Girafa();
		Pedra objeto = new Pedra();
		
		System.out.println(serVivo.estaVivo());
		System.out.println(objeto.estaVivo());
		System.out.println();
		
		System.out.println(serVivo.getTipoSer());
		System.out.println(objeto.getTipoSer());
	}
}
