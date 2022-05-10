package poopatterns.encapsulamento.grupo1;

public class Pessoa2 {
	private Pessoa1 conjuge = new Pessoa1();
	
	public String acessarConjuge() {
		return  conjuge.atributoPacote +
				" - " +
				conjuge.atributoHeranca +
				" - " +
				conjuge.atributoPublico;
	}
	
	@Override
	public String toString() {
		return "conjuge".toUpperCase();
	}
}
