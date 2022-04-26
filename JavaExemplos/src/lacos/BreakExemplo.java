package lacos;

public class BreakExemplo {
	public static void main(String[] args) {
		for(int i = 0;;i++) {
			System.out.println(i);
			if(i == 5) {
				break;
			}
		}
		int contador = 0;
		while(true) {
			System.out.println(contador);
			contador++;
			if(contador == 5) {
				break;
			}
		}
	}
}
