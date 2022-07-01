package br.com.exemplo.cminado.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Tabuleiro implements CampoObservador{
	private final int linhas;
	private final int colunas;
	private int minas;
	
	private final List<Campo> campos = 
			new ArrayList<>();
	
	private final List< Consumer<Boolean> > observadores =
			new ArrayList< Consumer<Boolean> >();
	
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
	
	public void paraCada(Consumer<Campo> funcao) {
		campos.forEach(funcao);
	}
	
	public void registrarObservador(Consumer<Boolean> observador) {
		observadores.add(observador);
	}
	
	private void notificarObservadores(boolean resultado) {
		observadores.stream().forEach(
					o -> o.accept(resultado)
				);
	}
	
	public void abrir(int linha, int coluna) {
		campos.parallelStream()
			  .filter(c -> c.getLinha() == linha
			  		  &&
			  		  c.getColuna() == coluna
					  )
			  .findFirst()
			  .ifPresent(c -> c.abrir());
	}
	
	public void mostrarMinas() {
		campos.
			stream().
			filter(c -> c.isMinado()).
			filter(c -> !c.isMarcado()).
			forEach(c -> c.setAberto(true));
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
				Campo campo = new Campo(linha, coluna);
				campo.registrarObservador(this);
				campos.add( campo );
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
		
		if(campos.size() <= minas) {
			campos.forEach(c -> c.alterarMinado());
			return;
		}
		
		do {
			minasArmadas = campos.stream().filter(minado)
							     .count()
							     ;
			int aleatorio = (int)( Math.random() * 
								   campos.size()
								 )
								 ;
			campos.get(aleatorio).alterarMinado();
			
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
		minas = new Random().nextInt(30);
		sortearMinas();
	}
	
	
	
	public int getLinhas() {
		return linhas;
	}

	public int getColunas() {
		return colunas;
	}
	
	public int getQuantidadeMinas() {
		return (int) 
			   campos.stream()
			   .filter(c -> c.isMinado())
			   .count()
			   ;
	}

	public void printCampos() {
		for(Campo campo : campos) {
			System.out.println(
					campo.isAberto() + " | " +
					campo.isMarcado() + " | " +
					campo.isMinado() + " ; "
					);
		}
	}

	@Override
	public void eventoOcorreu(Campo campo, CampoEvento evento) {
		
		if(evento == CampoEvento.EXPLODIR) {
			mostrarMinas();
			notificarObservadores(false);
		}
		else 
		if( objetivoAlcancado() ){
			notificarObservadores(true);
		}
		
	}
}
