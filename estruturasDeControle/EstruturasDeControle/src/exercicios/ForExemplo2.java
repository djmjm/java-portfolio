package exercicios;

public class ForExemplo2 {
	public static void main(String[] args) {
		for(int i = 0; i < 10 ; i += 2) System.out.println(i);
		for(int i = 0; !(i <= -10) ; i -= 2) System.out.println(i);
		for(double i = 0.0; i < 0.10; i += 0.02) System.out.println(i);
		for(boolean i = true, j = false; !(i && j); j = i) {
			System.out.println(i);
			System.out.println(j);
		}
	}
}
