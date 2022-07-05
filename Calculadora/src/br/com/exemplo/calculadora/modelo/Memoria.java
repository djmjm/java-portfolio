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
	
	private String textoAtual = "";
	
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
		
		textoAtual += valor;
		if(valor.equals("AC")) {
			textoAtual = "";
		}
		
		observadores.forEach(o ->
					o.valorAlterador(getTextoAtual())
				);
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
			if(texto.equals(",")) { return TipoComando.VIRGULA;}
		}
		
		return null;
	}
}
