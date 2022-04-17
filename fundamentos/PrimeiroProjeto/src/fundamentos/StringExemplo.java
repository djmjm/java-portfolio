package fundamentos;

public class StringExemplo {
	public static void main(String[] args) {
		String quebra_linha = "\n";
		String espaco = " ";
		
		String nome = "Douglas";
		String sobrenome = "Janovik Maliszewski";
		String idade = "26";
		
		System.out.println(
				"Nome - " + nome
				+ quebra_linha +
				"Sobrenome - " + sobrenome
				+ quebra_linha +
				"Idade - " + idade
				+ quebra_linha
				);
		
		Boolean questao_1 = sobrenome.contains("Janovik");
		System.out.println(
				"Sobrenome contém 'Janovik'? - "
				+ questao_1 + quebra_linha
				);
		
		Boolean questao_2 = sobrenome.contains(espaco);
		System.out.println(
				"Sobrenome contém ' '? - "
				+ questao_2 + quebra_linha
				);
		
		Boolean questao_3 = nome.contains(espaco);
		System.out.println(
				"Nome contém ' '? - "
				+ questao_3 + quebra_linha
				);
		
		Boolean questao_4 = 
				Integer.parseInt(idade) > 18;
		System.out.println(
				"É maior de idade (18 anos)? - "
				+ questao_4 + quebra_linha
				);
		
	}
}
