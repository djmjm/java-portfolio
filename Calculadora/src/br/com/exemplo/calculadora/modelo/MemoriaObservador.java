package br.com.exemplo.calculadora.modelo;

@FunctionalInterface
public interface MemoriaObservador {
	public void valorAlterador(String novoValor);
}
