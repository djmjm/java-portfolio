package generics;

public class CaixaNumeroTeste {
	public static void main(String[] args) {
		CaixaNumero<Integer> caixaA = new CaixaNumero<>();
		CaixaNumero<Double> caixaB = new CaixaNumero<>();
		CaixaNumero<Number> caixaC = new CaixaNumero<>();
		
		caixaA.guardar(3);
		caixaB.guardar(3.14159265);
		caixaC.guardar(444);
		
		System.err.println(caixaA.abrir());
		System.err.println(caixaB.abrir());
		System.err.println(caixaC.abrir()); caixaC.guardar(698.489);
		System.err.println(caixaC.abrir());
	}
}
