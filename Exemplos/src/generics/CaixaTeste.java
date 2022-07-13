package generics;

public class CaixaTeste {
	public static void main(String[] args) {
		Caixa<String> caixaA = new Caixa<>();
		Caixa<Double> caixaB = new Caixa<>();
		
		caixaA.guardar("Grêmio Football Porto-Alegrense");
		caixaB.guardar(3.14159265);
		
		System.out.println(caixaA.abrir());
		System.out.println(caixaB.abrir());
	}
}
