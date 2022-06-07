package poo;

/** retirando warnings (apenas exemplo para estudo) **/
@SuppressWarnings({ "all", "unused"})

public class EscopoEstaticoExemplo {
	public int atributo_objeto;
	public static int atributo_classe;
	
	public EscopoEstaticoExemplo() {
		atributo_classe = 1;
		atributo_objeto = 1;
	}
	
	public void mudarAtributoClasse(int atributo_classe){
		this.atributo_classe = atributo_classe;
	}
	
	public void mudarAtributoObjeto(int atributo_objeto) {
		this.atributo_objeto = atributo_objeto;
	}
}
