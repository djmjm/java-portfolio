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
	
	private List<CampoObservador> observadores =
			new ArrayList<CampoObservador>();
	
	public Campo(int linha, int coluna){
		this.linha = Math.max(linha, 0);
		this.coluna = Math.max(coluna, 0);
	}
	
	public void registrarObservador( CampoObservador observador ) {
		observadores.add(observador);
	}
	
	private void notificarObservadores(CampoEvento evento) {
		observadores.stream().
			forEach(o -> o.eventoOcorreu(this, evento)
					);
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
	
	public void alterarMinado() {
		if( !aberto ) {
			minado = !minado;
		}
	}
	
	public void alterarMarcacao() {
		if( !aberto ) {
			marcado = !marcado;
			
			if(marcado) {
				notificarObservadores(CampoEvento.MARCAR);
			}
			else {
				notificarObservadores(CampoEvento.DESMARCAR);
			}
			
		}
	}
	
	public boolean abrir() {
		if(!aberto && 
		   !marcado) {
			
			if(minado) {
				notificarObservadores(CampoEvento.EXPLODIR);
				return true;
			}
			
			setAberto(true);
			
			if( vizinhancaSegura() ) {
				vizinhos.forEach( v -> v.abrir() );
			}
			
			return true;
		}
		
		return false;
	}
	
	public boolean vizinhancaSegura() {
		return vizinhos.stream().noneMatch(v -> v.minado);
	}
	
	public boolean isMarcado() {
		return marcado;
	}
	
	public boolean isAberto() {
		return aberto;
	}
	
	public boolean isMinado() {
		return minado;
	}

	public int getLinha() {
		return linha;
	}

	public int getColuna() {
		return coluna;
	}
	
	public void setAberto(boolean aberto) {
		this.aberto = aberto;
		
		if(aberto) {
			notificarObservadores(CampoEvento.ABRIR);
		}
	}
	
	public boolean objetivoAlcancado() {
		boolean desvendado = !minado && aberto;
		boolean protegido = minado && marcado;
		
		return desvendado || protegido;
	}
	
	public int minasNaVizinhanca() {
		return (int) vizinhos.stream().filter(c -> c.minado).count();
	}
	
	void reiniciar() {
		aberto = false;
		marcado = false;
		minado = false;
		notificarObservadores(CampoEvento.REINICIAR);
	}
	
}
