package br.com.exemplo.cminado;

import br.com.exemplo.cminado.modelo.Campo;

public class Vizinhos {
	public static void main(String[] args) {
		
		Campo campo1 = new Campo(10, 10);
		System.out.println(campo1.adicionarVizinho(
								new Campo(1, 1))
						  );
		System.out.println(campo1.adicionarVizinho(
				new Campo(10, 9))
		  );
		System.out.println(campo1.adicionarVizinho(
				new Campo(11, 11))
		  );
		System.out.println(campo1.adicionarVizinho(
				new Campo(12, 8))
		  );
	}
}
