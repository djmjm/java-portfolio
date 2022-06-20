package br.com.exemplo.cminado;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.exemplo.cminado.modelo.Campo;

class CampoTeste {

	@Test
	void create() {
		Campo campo = new Campo(10, 10);
		assert (campo instanceof Campo);
		
		campo = new Campo(-10, 500);
		assert (campo instanceof Campo);
		
		campo = new Campo(-10, -500);
		assert (campo instanceof Campo);
	}
	
	@Test
	void adicionarVizinho() {
		Campo campo = new Campo(10, 10);
		
		boolean esquerda = campo.adicionarVizinho(10-1, 10);
		boolean direita = campo.adicionarVizinho(10+1, 10);
		boolean cima = campo.adicionarVizinho(10, 10-1);
		boolean baixo = campo.adicionarVizinho(10, 10+1);
		
		assert(esquerda);
		assert(direita);
		assert(cima);
		assert(baixo);
		
		Campo vizinho = new Campo(9, 11);
		Campo naoVizinho = new Campo(20, 20);
		
		boolean checarVizinho = campo.adicionarVizinho(vizinho);
		boolean checarNaoVizinho = !campo.adicionarVizinho(naoVizinho);
		
		assert(checarVizinho);
		assert(checarNaoVizinho);
		
	}
	
	@Test
	void marcado() {
		Campo campo = new Campo(1, 1);
		
		boolean marcado = !campo.isMarcado();
		assert(marcado);
		
		campo.alterarMarcacao();
		marcado = campo.isMarcado();
		assert(marcado);
	}
	
	@Test
	void aberto() {
		Campo campo = new Campo(2, 2);
		
		boolean aberto = !campo.isAberto();
		assert(aberto);
		
		aberto = campo.abrir();
		assert(aberto);
		
		aberto = campo.isAberto();
		assert(aberto);
		
		aberto = campo.abrir();
		assert(!aberto);
	}
	
	@Test
	void minado() {
		Campo campo = new Campo(3, 3);
		boolean minado = !campo.isMinado();
		assert(minado);
		
		campo.alterarMinado();
		minado = campo.isMinado();
		assert(minado);
	}
	
	@Test
	void vizinhancaSegura() {
		Campo campo = new Campo(4, 4);
		
		boolean vizinhancaSegura = campo.vizinhancaSegura();
		assert(vizinhancaSegura);
		
		campo.adicionarVizinho(new Campo(3,3));
		vizinhancaSegura = campo.vizinhancaSegura();
		assert(vizinhancaSegura);
		
		
		Campo vizinhoMinado = new Campo(4, 5);
		vizinhoMinado.alterarMinado();
		campo.adicionarVizinho(vizinhoMinado);
		vizinhancaSegura = campo.vizinhancaSegura();
		assert(!vizinhancaSegura);
		
	}

}
