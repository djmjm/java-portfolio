package poo;

/** retirando warnings (apenas exemplo para estudo) **/
@SuppressWarnings({ "all", "unused"})

public class EscopoEstaticoExemploTeste {
	public static void main(String[] args) {
		EscopoEstaticoExemplo objeto_1 = new EscopoEstaticoExemplo();
		EscopoEstaticoExemplo objeto_2 = new EscopoEstaticoExemplo();
		
		System.out.println(objeto_1.atributo_objeto + " - " +
						   objeto_1.atributo_classe
						);
		
		System.out.println(objeto_2.atributo_objeto + " - " +
				   		   objeto_2.atributo_classe
				);
		
		objeto_1.mudarAtributoClasse(2);
		
		System.out.println(objeto_1.atributo_objeto + " - " +
				   		   objeto_1.atributo_classe
				);

		System.out.println(objeto_2.atributo_objeto + " - " +
				   		   objeto_2.atributo_classe
				);
		
		objeto_1.mudarAtributoObjeto(3);
		
		System.out.println(objeto_1.atributo_objeto + " - " +
		   		   objeto_1.atributo_classe
		);

		System.out.println(objeto_2.atributo_objeto + " - " +
				   		   objeto_2.atributo_classe
				);
	}
}
