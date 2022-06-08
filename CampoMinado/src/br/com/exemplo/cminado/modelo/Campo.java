// Ainda em construçãp
// finalização em breve ...

package br.com.exemplo.cminado.modelo;

import java.util.ArrayList;
import java.util.List;

public class Campo {
	private final int linha;
	private final int coluna;
	
	private boolean aberto = false;
	private boolean marcado = false;
	private boolean minado = false;
	
	private List<Campo> vizinhos = 
				new ArrayList<Campo>();
	
	Campo(int linha, int coluna){
		this.linha = linha;
		this.coluna = coluna;
	}
	
	boolean adicionarVizinho(Campo vizinho){
		return true;
	}
}
