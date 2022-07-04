package br.com.exemplo.calculadora.visao;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Teclado extends JPanel{
	
	private final Color COR_CINZA_ESCURO = 
			new Color(68, 68, 68);
	private final Color COR_CINZA_CLARO = 
			new Color(99, 99, 99);
	private final Color COR_LARANJA = 
			new Color(242, 163, 60);
	
	
	public Teclado() {
		
		setLayout( new GridLayout(5, 4) );
		
		add(new Botao("AC", COR_CINZA_ESCURO));
		add(new Botao("+/-", COR_CINZA_ESCURO));
		add(new Botao("%", COR_CINZA_ESCURO));
		add(new Botao("/", COR_LARANJA));
		
		add(new Botao("7", COR_CINZA_CLARO));
		add(new Botao("8", COR_CINZA_CLARO));
		add(new Botao("9", COR_CINZA_CLARO));
		add(new Botao("*", COR_LARANJA));
		
		add(new Botao("4", COR_CINZA_CLARO));
		add(new Botao("5", COR_CINZA_CLARO));
		add(new Botao("6", COR_CINZA_CLARO));
		add(new Botao("-", COR_LARANJA));
		
		add(new Botao("1", COR_CINZA_CLARO));
		add(new Botao("2", COR_CINZA_CLARO));
		add(new Botao("3", COR_CINZA_CLARO));
		add(new Botao("+", COR_LARANJA));
	}
}
