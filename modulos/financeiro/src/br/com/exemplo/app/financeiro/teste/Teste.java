package br.com.exemplo.app.financeiro.teste;

import br.com.exemplo.app.calculo.Calculadora;
import br.com.exemplo.app.calculo.interno.OperacoesAritmeticas;
import br.com.exemplo.app.logging.Logger;

public class Teste {
	public static void main(String[] args) {
		Calculadora calculadora = 
				new Calculadora();
		
		var answer = calculadora.soma(1, 2, 3);
		Logger.info("Imprimindo resultado ...");
		System.out.println(answer);
		
		answer = new OperacoesAritmeticas().
					 soma(10, 100, 1000)
					 ;
		Logger.info("Nova soma ...");
		System.out.println(answer);
	}
}
