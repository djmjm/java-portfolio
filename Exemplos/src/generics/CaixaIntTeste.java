package generics;

public class CaixaIntTeste {
	public static void main(String[] args) {
		CaixaInt caixaA = new CaixaInt();
		Caixa<CaixaInt> caixaB = new Caixa<CaixaInt>();
		
		caixaA.guardar(1995); caixaB.guardar(caixaA);
		
		System.out.println( caixaB.abrir()
								  .abrir()
						  );
	}
}
