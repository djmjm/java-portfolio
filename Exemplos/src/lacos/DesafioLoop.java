package lacos;

import java.util.Scanner;

public class DesafioLoop {
	public static void main(String[] args) {
		double notas_valor_total = 0.0;
		double notas_numero_total = 0.0;
		
		System.out.println("Digite a próxima nota do aluno (0-10)");
		
		Scanner leitor = new Scanner(System.in);
		double numero_lido = leitor.nextDouble();
		boolean questao = numero_lido >= 0 && numero_lido <= 10;
		
		while(questao) {
			notas_numero_total++;
			notas_valor_total += numero_lido;
			
			System.out.println("Digite a próxima nota do aluno (0-10)");
			
			numero_lido = leitor.nextDouble();
			questao = numero_lido >= 0 && numero_lido <= 10;
			
		}
		
		System.out.println("Total de notas - "
					+ notas_numero_total
			);
		System.out.println("Somatório - "
				+ notas_valor_total
			);
		System.out.println("Total de notas - "
				+ notas_valor_total / notas_numero_total
			);
			
		leitor.close();
	}
}
