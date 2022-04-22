package exercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IfRecursivo {
	public IfRecursivo(int numero) {
		if(numero > 0) new IfRecursivo(--numero);
		else return;
		System.out.println("IF");
	}
	public static void main(String[] args) {
		int numero_ifs;
		Scanner leitor = new Scanner(System.in);
		System.out.println("Quantos ifs devem ser gerados?");
		try {
			numero_ifs = leitor.nextInt();
		}catch(InputMismatchException e) {
			leitor.close();
			return;
		}
		leitor.close();
		
		new IfRecursivo(numero_ifs);
	}
}
