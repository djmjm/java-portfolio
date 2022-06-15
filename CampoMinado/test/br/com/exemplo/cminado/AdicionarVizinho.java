package br.com.exemplo.cminado;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import br.com.exemplo.cminado.modelo.Campo;

class AdicionarVizinho {

	@Test
	void test() {
		int x = 10;
		int y = 10;
		
		int esquerda = x - 1;
		int direita = x + 1;
		int cima = y - 1;
		int baixo = y + 1;
		
		Campo campoTeste = new Campo(x, y);
		
		List<Boolean> transversais = Arrays.asList(
						campoTeste.
						adicionarVizinho
						(esquerda, y)
						,
						campoTeste.
						adicionarVizinho
						(direita, y)
						,
						campoTeste.
						adicionarVizinho
						(x, cima)
						,
						campoTeste.
						adicionarVizinho
						(x, baixo)
					);
		List<Boolean> diagonais = Arrays.asList(
						campoTeste.
						adicionarVizinho
						(esquerda, cima)
						,
						campoTeste.
						adicionarVizinho
						(direita, cima)
						,
						campoTeste.
						adicionarVizinho
						(direita, cima)
						,
						campoTeste.
						adicionarVizinho
						(esquerda, baixo)
					);
		
		List<Boolean> naoVizinhos = Arrays.asList(
						campoTeste.
						adicionarVizinho
						(esquerda-1, cima)
						,
						campoTeste.
						adicionarVizinho
						(direita, cima-5)
						,
						campoTeste.
						adicionarVizinho
						(direita, cima+10)
						,
						campoTeste.
						adicionarVizinho
						(esquerda+1949, baixo)
					);
		
		
		for(boolean vizinho : diagonais) {
			assert(vizinho);
		}
		
		for(boolean vizinho : transversais) {
			assert(vizinho);
		}
		
		for(boolean vizinho : naoVizinhos) {
			assert(!vizinho);
		}
		
		
		
	}

}
