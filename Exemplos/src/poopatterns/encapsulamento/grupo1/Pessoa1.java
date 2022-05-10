package poopatterns.encapsulamento.grupo1;

public class Pessoa1 {

	private String atributoPrivado = "privado";
	String atributoPacote = "pacote";
	protected String atributoHeranca = "herança";
	public String atributoPublico = "público";
	
	public String getAtributoPrivado(){
		return atributoPrivado;
	}
	
	public void setAtributoPrivado(String atributoPrivado) {
		this.atributoPrivado = atributoPrivado;
	}
}
