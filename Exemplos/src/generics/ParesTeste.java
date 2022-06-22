package generics;

public class ParesTeste {
	public static void main(String[] args) {
		Pares<Integer, String> resultadoConcurso =
				new Pares<>();
		
		resultadoConcurso.adicionar(1,  "João");
		resultadoConcurso.adicionar(2,  "Pedro");
		resultadoConcurso.adicionar(3,  "Paulo");
		resultadoConcurso.adicionar(4,  "Maria");
		resultadoConcurso.adicionar(2,  "Joana");
		
		System.out.println(resultadoConcurso.getValor(2));
		System.out.println(resultadoConcurso.getValor(1));
	}
}
