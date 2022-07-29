module app.calculo {
	requires transitive app.logging;
	exports br.com.exemplo.app.calculo;
	exports br.com.exemplo.app.calculo.interno
		to app.financeiro
		;
}