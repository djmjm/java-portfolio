package br.com.exemplo.app.financeiro.teste;

import br.com.exemplo.app.calculo.Calculadora;
import br.com.exemplo.app.logging.Logger;

public class Teste {
	public static void main(String[] args) {
		Calculadora calculadora = 
				new Calculadora();
		
		var answer = calculadora.soma(1, 2, 3);
		Logger.info("Imprimindo resultado ...");
		System.out.println(answer);
	}
}
