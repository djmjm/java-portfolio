package lacos;

public class ForExemplo {
	public static void main(String[] args) {
		System.out.println("PRIMEIRO FOR");
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		System.out.println("SEGUNDO FOR");
		for(int i = 0; i < 10;) {
			System.out.println(i++);
		}
		
		System.out.println("TERCEIRO FOR");
		for(int i = 0;; i++) {
			System.out.println(i);
			if(i == 9) break;
		}
	}
}
