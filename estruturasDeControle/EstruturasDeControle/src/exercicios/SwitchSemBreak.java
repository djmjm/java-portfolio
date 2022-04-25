package exercicios;

import java.util.Scanner;

public class SwitchSemBreak {
	public static void main(String[] args) {
		System.out.println("Copa do Brasil ... Ano ... Campeão?");
		
		Scanner leitor = new Scanner(System.in);
		String resposta = leitor.nextLine();
		leitor.close();
		
		switch(resposta) {
			case "1989":
			case "1994": 
			case "1997": 
			case "2001": 
			case "2016": System.out.println("CORRETO!"); 
						return;
			default: System.out.println("ERRADO!"); 
					return;
		}
	}
}
