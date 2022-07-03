package br.com.exemplo.cminado;

import br.com.exemplo.cminado.modelo.Tabuleiro;
import br.com.exemplo.cminado.visao.AplicacaoConsole;

public class Aplicacao {
	public static void main(String[] args) {
		Tabuleiro tabuleiro = new Tabuleiro(6, 6, 6);
		new AplicacaoConsole(tabuleiro);
	}
}
