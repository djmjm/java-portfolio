package br.com.exemplo.cminado.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import br.com.exemplo.cminado.excecao.ExplosaoException;

public class Tabuleiro {
	private int linhas;
	private int colunas;
	private int minas;
	
	private final List<Campo> campos = 
			new ArrayList<>();
	
	public Tabuleiro(int linhas,
					 int colunas,
					 int minas
			) {
		this.linhas = linhas;
		this.colunas = colunas;
		this.minas = minas;
		
		gerarCampos();
		associarVizinhos();
		sortearMinas();
	}
	
	public void abrir(int linha, int coluna) {
		try {
			campos.parallelStream()
				  .filter(c -> c.getLinha() == linha
				  		  &&
				  		  c.getColuna() == coluna
						  )
				  .findFirst()
				  .ifPresent(c -> c.abrir());
		}
		catch(ExplosaoException e) {
			//FIXME ajustar tabuleiro nova versão
			campos.forEach(c -> c.setAberto(true));
			throw e;
		}
	}
	
	public void marcar(int linha, int coluna) {
		campos.parallelStream()
			  .filter(c -> c.getLinha() == linha
			  		  &&
			  		  c.getColuna() == coluna
					  )
			  .findFirst()
			  .ifPresent(c -> c.alterarMarcacao());
	}
	
	public void gerarCampos() {
		for(int linha = 0; linha < linhas; linha++) {
			for(int coluna = 0; coluna < colunas; coluna++) {
				campos.add(new Campo(linha, coluna) );
			}
		}
	}
	
	public void associarVizinhos() {
		for(Campo c1: campos) {
			for(Campo c2: campos) {
				c1.adicionarVizinho(c2);
			}
		}
	}
	
	private void sortearMinas() {
		long minasArmadas = 0;
		Predicate<Campo> minado = c -> c.isMinado();
		
		do {
			minasArmadas = campos.stream().filter(minado)
							     .count()
							     ;
			int aleatorio = (int)( Math.random() * 
								   campos.size()
								 )
								 ;
			campos.get(aleatorio).alterarMinado();;
			
		}while(minasArmadas < minas);
	}
	
	public boolean objetivoAlcancado() {
		return campos.stream().allMatch(
					c -> c.objetivoAlcancado()
				)
				;
	}
	
	public void reiniciar() {
		campos.stream().forEach(c -> c.reiniciar());
		sortearMinas();
	}
}
