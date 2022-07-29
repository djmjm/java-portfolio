package br.com.exemplo.app.calculo;

import br.com.exemplo.app.calculo.interno.OperacoesAritmeticas;
import br.com.exemplo.app.logging.Logger;

public class Calculadora {
	private OperacoesAritmeticas operacoes =
			new OperacoesAritmeticas();

	public double soma(double... nums) {
		Logger.info("Somando ...");
		return operacoes.soma(nums);
	}
	
}
