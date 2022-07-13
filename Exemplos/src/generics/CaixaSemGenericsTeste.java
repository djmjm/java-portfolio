package generics;

public class CaixaSemGenericsTeste {
	public static void main(String[] args) {
		var caixaA = new CaixaSemGenerics();
		caixaA.guardar(1111);
		var resultadoA = (Integer) caixaA.abrir();
		System.out.println(resultadoA);
		
		var caixaB = new CaixaSemGenerics();
		caixaB.guardar("Hello caixa!!!");
		var resultadoB = (String) caixaB.abrir();
		System.out.println(resultadoB);
	}
}
