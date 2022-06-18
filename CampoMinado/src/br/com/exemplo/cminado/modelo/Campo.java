// Ainda em construçãp
// finalização em breve ...

package br.com.exemplo.cminado.modelo;

import java.util.ArrayList;
import java.util.List;

import br.com.exemplo.cminado.excecao.ExplosaoException;

public class Campo {
	private final int linha;
	private final int coluna;
	
	private boolean aberto = false;
	private boolean marcado = false;
	private boolean minado = false;
	
	private List<Campo> vizinhos = 
				new ArrayList<Campo>();
	
	public Campo(int linha, int coluna){
		this.linha = linha;
		this.coluna = coluna;
	}
	
	public boolean adicionarVizinho(int x, int y) {
		var campo = new Campo(x, y);
		return adicionarVizinho(campo);
	}
	
	public boolean adicionarVizinho(Campo vizinho){
		
		boolean linhaDiferente = linha != vizinho.linha;
		boolean colunaDiferente = coluna != vizinho.coluna;
		boolean diagonal = linhaDiferente && colunaDiferente;
		
		int deltaLinha = Math.abs(linha - vizinho.linha);
		int deltaColuna = Math.abs(coluna - vizinho.coluna);
		int deltaGeral = deltaColuna + deltaLinha;
		
		boolean adjsPerpendicular = deltaGeral == 1 &&
									!diagonal;
		
		boolean adjsDiagonal = deltaGeral == 2 &&
							   diagonal;
		
		if( adjsPerpendicular ||
			adjsDiagonal	) {
			  vizinhos.add(vizinho);
			  return true;
		}else{
		      return false; 
		}
	}
	
	void alterarMarcacao() {
		if( !aberto ) {
			marcado = !marcado;
		}
	}
	
	boolean abrir() {
		if(!aberto && 
		   !marcado) {
			
			aberto = true;
			
			if(minado) {
				throw new ExplosaoException();
			}
			
			if( vizinhancaSegura() ) {
				vizinhos.forEach( v -> v.abrir() );
			}
		}
		
		return false;
	}
	
	boolean vizinhancaSegura() {
		return vizinhos.stream().noneMatch(v -> v.minado);
	}
	
	
}
