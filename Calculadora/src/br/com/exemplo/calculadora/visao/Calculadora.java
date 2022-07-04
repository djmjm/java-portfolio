package br.com.exemplo.calculadora.visao;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.border.Border;

@SuppressWarnings("serial")
public class Calculadora extends JFrame{
	public Calculadora() {
		
		organizarLayout();
		
		setSize(232, 322);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setLocationRelativeTo(null);
		
	}
	
	private void organizarLayout() {
		setLayout(new BorderLayout());
		
		Display display = new Display();
		Teclado teclado = new Teclado();
		
		display.setPreferredSize(new Dimension(233, 60));
		add(display, BorderLayout.NORTH);
		add(teclado, BorderLayout.CENTER);
		
	}

	public static void main(String[] args) {
		new Calculadora();
	}
}
