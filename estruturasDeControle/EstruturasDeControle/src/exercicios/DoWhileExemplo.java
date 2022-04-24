package exercicios;

import java.util.Scanner;

public class DoWhileExemplo {
	public static void main(String[] args) {
		do {
			Scanner leitor = new Scanner(System.in);
			String resposta;
			do {
				System.out.println("Write once ...");
				resposta = leitor.nextLine();
			}while(!resposta.equalsIgnoreCase("run anywhere"));
			leitor.close();
		}while(false);
	}
}
