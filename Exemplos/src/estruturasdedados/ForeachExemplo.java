package estruturasdedados;

public class ForeachExemplo {
	public static void main(String[] args) {
		double notas[] = { 5.2, 9.8, 10.0, 7.1, 5.5 };
		
		for(double nota_indice: notas) {
			System.out.println(nota_indice);
		}
	}
}
