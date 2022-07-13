package br.com.exemplo.cminado.visao;

import java.awt.Toolkit;
import java.util.Random;

import javax.swing.JFrame;

import br.com.exemplo.cminado.modelo.Tabuleiro;

@SuppressWarnings("serial")
public class TelaPrincipal extends JFrame{
	
	public TelaPrincipal() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("img\\icon.png"));
		
		Tabuleiro tabuleiro = 
				new Tabuleiro(16, 30, new Random().
										  nextInt(30)
							);
		
		PainelTabuleiro painelTabuleiro =
				new PainelTabuleiro(tabuleiro);
		
		add(painelTabuleiro);
		
		setTitle("Campo Minado");
		setSize(690, 438);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new TelaPrincipal();
	}
	
}
