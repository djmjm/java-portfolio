package br.com.exemplo.calculadora.visao;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Display extends JPanel{
	
	private final JLabel label;
	
	public Display() {
		setBackground( Color.WHITE );
		label = new JLabel("1114,5");
		label.setForeground(new Color(46, 49, 50) );
		label.setFont(new Font("courier", 
						  Font.PLAIN,
						  30) 
					);
		
		setLayout( new FlowLayout(FlowLayout.RIGHT) );
		
		add(label);
	}
}
