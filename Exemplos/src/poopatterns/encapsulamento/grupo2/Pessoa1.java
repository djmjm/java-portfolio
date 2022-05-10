package poopatterns.encapsulamento.grupo2;

public class Pessoa1{
	private poopatterns.encapsulamento.grupo1.Pessoa1 
		conhecido = new poopatterns.encapsulamento.grupo1.Pessoa1();
	
	public String acessarConhecido() {
		return  
				conhecido.atributoPublico;
	}
	
	@Override
	public String toString() {
		return "Conhecido".toUpperCase();
	}
}
