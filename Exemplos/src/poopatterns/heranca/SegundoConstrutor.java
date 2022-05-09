package poopatterns.heranca;

public class SegundoConstrutor extends PrimeiroConstrutor {
	private final String segundoAtributo;
	
	public SegundoConstrutor() {
		this("Padrão");
	}
	
	public SegundoConstrutor(String segundoAtributo){
		super(segundoAtributo);
		this.segundoAtributo = segundoAtributo + " - 2";
	}
	
	public String getSegundoAtributo() {
		return segundoAtributo;
	}
	
	@Override
	public String getPrimeiroAtributo() {
		return super.getPrimeiroAtributo();
	}
}
