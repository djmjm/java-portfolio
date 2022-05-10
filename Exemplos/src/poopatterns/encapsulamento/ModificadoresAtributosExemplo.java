package poopatterns.encapsulamento;

import poopatterns.encapsulamento.grupo1.Pessoa1;

public class ModificadoresAtributosExemplo {
	public static void main(String[] args) {
		Pessoa1 anonimo = new Pessoa1();
		
		System.out.println(anonimo.getAtributoPrivado());
		anonimo.setAtributoPrivado("modificado");
		System.out.println(anonimo.getAtributoPrivado());
	}
}
