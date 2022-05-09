package poopatterns.heranca;

public class PrimeiroConstrutor {
	private final String primeiroAtributo;
	
	public PrimeiroConstrutor() {
		this("Padrão");
	}
	
	public PrimeiroConstrutor(String primeiroAtributo){
		this.primeiroAtributo = primeiroAtributo + " - 1";
	}
	
	public String getPrimeiroAtributo() {
		return primeiroAtributo;
	}
}
