package br.com.exemplo.calculadora.modelo;

import java.util.ArrayList;
import java.util.List;

public class Memoria {
	
	private enum TipoComando{
		ZERAR, NUMERO, DIV, MULT, 
		SUB, SOMA, IGUAL, VIRGULA
	}
	
	private static final Memoria instancia =
			new Memoria();
	
	private final List<MemoriaObservador> observadores =
			new ArrayList<>();
	
	private TipoComando ultimaOperacao = null;
	private boolean substituir = false;
	private String textoAtual = "";
	private String textoBuffer = "";
	
	private Memoria() { } ;
	
	public static Memoria getInstancia() {
		return instancia;
	}
	
	public void adicionarObservador(
					MemoriaObservador
					observador
				) {
		observadores.add(observador);
	}
	
	public String getTextoAtual() {
		return textoAtual.isEmpty() 
				? "0"
				: textoAtual
				;
	}
	
	public void processarComando(String valor) {
		
		TipoComando tipoComando = 
				detectarTipoComando(valor);
		
		System.out.println(tipoComando);
		
		if(tipoComando == null) { return; }
		
		switch(tipoComando) {
			case ZERAR: 	textoAtual = "";
							textoBuffer = "";
							substituir = false;
							ultimaOperacao = null;
							break;
						
			case VIRGULA:
			case NUMERO: 	textoAtual = 
								substituir 
										?
										valor 
										:
										textoAtual + valor;
			
							substituir = false;
							break;
			
			default: 	substituir = true;
						textoAtual = obterResultadoOperacao();
						textoBuffer = textoAtual;
						ultimaOperacao = tipoComando;
						break;
		}
		
		observadores.forEach(o ->
					o.valorAlterador(getTextoAtual())
				);
	}

	private String obterResultadoOperacao() {
		if(ultimaOperacao == null) {
			return textoAtual;
		}
		
		double numeroBuffer = Double.parseDouble(
									textoBuffer.
									replace(",", ".")
								)
				;
		
		double numeroAtual = Double.parseDouble(
									textoAtual.
									replace(",", ".")
								)
				;
		
		double resultado = 0;
		
		switch(ultimaOperacao) {
		
			case SOMA:	resultado = numeroBuffer +
									numeroAtual
									;
						break;
						
			case SUB:	resultado = numeroBuffer -
									numeroAtual
									;
						break;
						
			case MULT:	resultado = numeroBuffer *
									numeroAtual
									;
						break;
						
			case DIV:	resultado = numeroBuffer /
									numeroAtual
									;
						break;
						
			default: break;
		
		}
		
		String resultadoString = Double.
								 toString(resultado).
								 replace(".", ",")
								 ;
		
		boolean isInteiro = resultadoString.endsWith(",0");
		
		return (isInteiro 
					? resultadoString.replace(",0", "")
					: resultadoString
				)
				;

	}

	private TipoComando detectarTipoComando(
					String texto
					) {
		if(textoAtual.isEmpty() &&
				texto.equals("0")) {
			return null;
		}
		
		try {
			Integer.parseInt(texto);
			return TipoComando.NUMERO;
		}catch(NumberFormatException e) {
			if(texto.equals("AC")) { return TipoComando.ZERAR;}
			if(texto.equals("/")) { return TipoComando.DIV;}
			if(texto.equals("*")) { return TipoComando.MULT;}
			if(texto.equals("+")) { return TipoComando.SOMA;}
			if(texto.equals("-")) { return TipoComando.SUB;}
			if(texto.equals("=")) { return TipoComando.IGUAL;}
			if(texto.equals(",")
				&& !textoAtual.contains(",")	
					) { return TipoComando.VIRGULA;}
		}
		
		return null;
	}
}
