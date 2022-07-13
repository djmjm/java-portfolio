package br.com.exemplo.cminado.visao;

import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

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
		
		mostrarQuantidadeMinas(tabuleiro);
		
		tabuleiro.registrarObservador(
					e -> {
							SwingUtilities.invokeLater(() -> {
								if( e ) {
									JOptionPane.
									showMessageDialog(null, "Você ganhou!!!",
											null, 0, new ImageIcon(Toolkit.getDefaultToolkit().
														getImage("img\\icon26.png")
														)
										);
								}
								else {
									JOptionPane.
									showMessageDialog(null, "Você perdeu...",
										null, 0, new ImageIcon(Toolkit.getDefaultToolkit().
													getImage("img\\icon26.png")
													)
									);
									
									
								}
								tabuleiro.reiniciar();
								mostrarQuantidadeMinas(tabuleiro);
							}
							)
							;
						}
				);
	}
	
	private void mostrarQuantidadeMinas(Tabuleiro tabuleiro) {
		JOptionPane.
			showMessageDialog(null, 
					"      * COMEÇANDO JOGO *     "
					+ "\n" +
					"                 " + tabuleiro.getQuantidadeMinas()    + 
					" minas.                  "
					+ "\n" +
					"               Boa sorte ! ! !              ",
					
					null, 0, new ImageIcon(Toolkit.getDefaultToolkit().
							getImage("img\\icon26.png")
							)
					)
					;
	}
}
