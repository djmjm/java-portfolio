package lacos;

public class ForExemplo3 {
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				System.out.printf("[%d][%d] - ", i+1, j+1);
			}
			System.out.println("\n");
		}
	}
}