package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		String quebra_linha = "\n";
		System.out.println("Println");
		System.out.print( "Print".concat(quebra_linha) );
		System.out.printf("%s", "Printf" + quebra_linha);
		
		Scanner leitor = new Scanner(System.in);
		
		Boolean fim_leitura = false;
		do {
			System.out.println("Digite 'fim' para terminar a execução:");
			fim_leitura = leitor.nextLine().equalsIgnoreCase("fim");
		}while(!fim_leitura); leitor.close();
		
		System.out.println("Execução terminada com sucesso!");
	}
}
