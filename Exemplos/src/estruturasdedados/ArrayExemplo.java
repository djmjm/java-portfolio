package estruturasdedados;

import java.util.Arrays;

public class ArrayExemplo {
	public static void main(String[] args) {
		
		double notas_aluno2[] = {4.5, 7.9};
		
		int quantidade_notas = notas_aluno2.length;
		double valor_total = 0;
				
		double notas_aluno1[] = new double[quantidade_notas];
		for(int i = 0; i < quantidade_notas; i++){
			notas_aluno1[i] = notas_aluno2[i] - 1;
			
			valor_total += notas_aluno1[i];
			valor_total += notas_aluno2[i];
		}
		
		System.out.println(Arrays.toString(notas_aluno1));
		System.out.println(Arrays.toString(notas_aluno2));
		System.out.println(valor_total);
		System.out.println(
				(double)valor_total / 
				(double)(quantidade_notas * 2) 
				);
		
	}
}
