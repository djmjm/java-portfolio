package br.com.exemplo.cminado.modelo;

@FunctionalInterface
public interface CampoObservador {
	public void eventoOcorreu( Campo campo, CampoEvento evento );
}
