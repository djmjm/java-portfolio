package poopatterns.heranca;

public class TerceiroConstrutor extends SegundoConstrutor {
	private final String terceiroAtributo;
	
	public TerceiroConstrutor() {
		this("Padrão");
	}
	
	public TerceiroConstrutor(String terceiroAtributo){
		super(terceiroAtributo);
		this.terceiroAtributo = terceiroAtributo + " - 3";
	}
	
	public String getTerceiroAtributo() {
		return terceiroAtributo;
	}
	
	@Override
	public String getSegundoAtributo() {
		return super.getSegundoAtributo();
	}
	
	@Override
	public String getPrimeiroAtributo() {
		return super.getPrimeiroAtributo();
	}
}
