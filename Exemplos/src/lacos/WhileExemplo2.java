package lacos;

import java.util.Scanner;

public class WhileExemplo2 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		String linha = leitor.nextLine();
		while(!linha.equalsIgnoreCase("sair")) {
			System.out.println(
					"Usuário diz: "
					+ linha
					);
			linha = leitor.nextLine();
		}
			
		leitor.close();
	}
}
