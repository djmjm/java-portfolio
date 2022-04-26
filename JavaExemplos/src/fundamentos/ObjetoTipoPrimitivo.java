package fundamentos;

public class ObjetoTipoPrimitivo {
	public static void main(String[] args) {
		String palavra_1 = "palavra";
		String palavra_2 = new String("palavra");
		
		System.out.println(palavra_1.equals(palavra_2));
		
		double numero_1 = 3.14159265;
		Double numero_2 = new Double(3.14159265); //deprecated
		
		System.out.println(numero_2.equals(numero_1));
	}
}
