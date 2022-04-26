package lacos;

public class WhileExemplo {
	public static void main(String[] args) {
		while(true) {
			int contador = 0;
			while(contador < 10) {
				System.out.println(++contador);
			}
			return;
		}
	}
}
