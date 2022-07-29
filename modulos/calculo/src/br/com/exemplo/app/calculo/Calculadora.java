package br.com.exemplo.app.calculo;

import br.com.exemplo.app.calculo.interno.OperacoesAritmeticas;

public class Calculadora {
	private OperacoesAritmeticas operacoes =
			new OperacoesAritmeticas();

	public double soma(double... nums) {
		return operacoes.soma(nums);
	}
	
}
