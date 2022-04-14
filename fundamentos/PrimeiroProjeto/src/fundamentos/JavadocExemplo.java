package fundamentos;

/**
 * 	Javadoc Exemplo;
 * 
 *  @version 3.14159265359
 *  @author Douglas Janovik Maliszewski (djmjm)
 *
 */

public class JavadocExemplo {
	public static void main(String[] args) {
		
		String quebra_linha = "\n";
		String texto = " /** " 
					+ quebra_linha
					+ "  * 	Javadoc Exemplo;" 
					+ quebra_linha
					+ "  * " 
					+ quebra_linha
					+ "  *  @version 3.14159265359" 
					+ quebra_linha
					+ "  *  @author Douglas Janovik Maliszewski (djmjm)" 
					+ quebra_linha
					+ "  *" 
					+ quebra_linha
					+ "  */ ";
		
		System.out.println(texto);
	}
}
