package estruturasdedados;

import java.util.Arrays;
import java.util.Scanner;

public class ForeachDesafio {
	public static void main(String[] args) {
		System.out.println("Insira número de notas ...");
		Scanner leitor = new Scanner(System.in);
		int notas_quantidade = leitor.nextInt();
		double notas_array[] = new double[notas_quantidade];
		
		for(int i = 0; i < notas_quantidade; i++) {
			System.out.println("Insira uma nota - " + (i+1));
			notas_array[i] = leitor.nextDouble();
		}
		
		leitor.close();
		
		System.out.println("Array lido:");
		System.out.println(Arrays.toString(notas_array));
		
		double notas_valor_total = 0;
		
		for(double nota_indice: notas_array) {
			notas_valor_total += nota_indice;
		}
		
		System.out.println("Media:");
		System.out.println(notas_valor_total / notas_quantidade);
	}
}
