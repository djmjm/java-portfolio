import br.com.exemplo.app.calculo.CalculadoraImpl;

module app.calculo {
	requires transitive app.logging;
	exports br.com.exemplo.app.calculo;
	exports br.com.exemplo.app.calculo.interno
		to app.financeiro
		;
	
	requires app.api;
	provides br.com.exemplo.app.Calculadora
		with CalculadoraImpl
		;
}