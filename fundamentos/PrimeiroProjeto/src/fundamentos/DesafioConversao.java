package fundamentos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DesafioConversao {
	
	private void leitor() throws InputMismatchException{
		var leitor = new Scanner(System.in);
		System.out.println(
				leitor.nextBoolean()
				);
		leitor.close();
	}
	
	private boolean ler() {
		try {
			this.leitor();
		}catch(InputMismatchException e) {
			System.out.println("Por favor, insira um valor booleano,"
					+ "tente novamente ..."
					);
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		while(new DesafioConversao().ler());
	}
}
