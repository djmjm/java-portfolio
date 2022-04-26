package lacos;

import java.util.Scanner;

public class DesafioDiasDaSemana {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		while(true) {
			String resposta = leitor.next();
			switch(resposta.toLowerCase()) {
				case "domingo": System.out.println(1); break;
				case "segunda": System.out.println(2); break;
				case "terca": System.out.println(3); break;
				case "quarta": System.out.println(4); break;
				case "quinta": System.out.println(5); break;
				case "sexta": System.out.println(6); break;
				case "sabado": System.out.println(7); break;
				default: leitor.close(); return;
			}
		}
	}
}
