// TEMPORARIO ...

package br.com.exemplo.cminado.visao;

import br.com.exemplo.cminado.modelo.Tabuleiro;

public class Temp {
	public static void main(String[] args) {
		Tabuleiro tabuleiro = new Tabuleiro(3, 3, 9);
		tabuleiro.abrir(2, 2);
		
		Tabuleiro tabuleiro2 = new Tabuleiro(3, 3, 9);
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				tabuleiro2.marcar(i, j);
			}
		}
	}
}
