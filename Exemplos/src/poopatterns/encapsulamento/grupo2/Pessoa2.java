package poopatterns.encapsulamento.grupo2;
import poopatterns.encapsulamento.grupo1.Pessoa1;

public class Pessoa2 extends Pessoa1{
	public String acessarPai() {
		return 
				atributoHeranca +
				" - " +
				atributoPublico;
	}
	
	@Override
	public String toString() {
		return "Herdeiro".toUpperCase();
	}
}
