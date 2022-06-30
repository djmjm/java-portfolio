package br.com.exemplo.cminado.visao;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import br.com.exemplo.cminado.modelo.Tabuleiro;

@SuppressWarnings("serial")
public class PainelTabuleiro extends JPanel {
	public PainelTabuleiro(Tabuleiro tabuleiro) {
		setLayout( new GridLayout(
						tabuleiro.getLinhas(), 
						tabuleiro.getColunas()
						) 
				)
		;
		tabuleiro.paraCada(c -> add( new BotaoCampo(c) ) );
		tabuleiro.registrarObservador(
					e -> {
						//TODO implementar funcionalidade \
						// observador  \
					}
				);
	}
}
