package estruturasdedados;

import java.util.Scanner;

public class MatrizExemplo {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Quantos alunos?");
		int numeroAlunos = leitor.nextInt();
		
		System.out.println("Quantas notas por aluno?");
		int numeroNotas = leitor.nextInt();
		
		double turma[][] = new double[numeroAlunos][numeroNotas];
		double notasValorTotal = 0;
		
		for(double[] alunos: turma) {
			System.out.println("Insira as notas do aluno ...");
			for(double nota: alunos) {
				nota = leitor.nextDouble();
				notasValorTotal += nota;
			}
		}
		leitor.close();
		
		System.out.println("Valor total somatório das notas:");
		System.out.println(notasValorTotal);
		System.out.println("Média da turma:");
		System.out.println(notasValorTotal / ( numeroAlunos * numeroNotas ) );
		
	}
}
