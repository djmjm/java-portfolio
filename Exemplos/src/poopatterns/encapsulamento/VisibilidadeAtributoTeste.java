package poopatterns.encapsulamento;
import poopatterns.encapsulamento.grupo1.*;
import poopatterns.encapsulamento.grupo2.*;

public class VisibilidadeAtributoTeste {
	public static void main(String[] args) {
		
		poopatterns.encapsulamento.grupo1.Pessoa2 
			esposa = new poopatterns.encapsulamento.grupo1.Pessoa2();
		
		poopatterns.encapsulamento.grupo2.Pessoa2 
			filho = new poopatterns.encapsulamento.grupo2.Pessoa2();
		
		poopatterns.encapsulamento.grupo2.Pessoa1
			conhecido = new poopatterns.encapsulamento.grupo2.Pessoa1();
		
		System.out.println(esposa);
		System.out.println(esposa.acessarConjuge());
		System.out.println();
		
		System.out.println(filho);
		System.out.println(filho.acessarPai());
		System.out.println();
		
		System.out.println(conhecido);
		System.out.println(conhecido.acessarConhecido());
		System.out.println();
	}
}
