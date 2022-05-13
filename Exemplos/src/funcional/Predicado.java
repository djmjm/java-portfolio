package funcional;

import java.util.function.Predicate;

import poopatterns.composicao.desafio.*;

public class Predicado {
	
	private static
	Predicate<Cliente> comprouKawa = cliente -> cliente.
												getNomesItensComprados().
												contains("kawa");
	private static
	Predicate<Cliente> comprouMientowka = cliente -> cliente.
									 getNomesItensComprados().
									 contains("mientowka");
	private static
	Predicate<Cliente> comprouAlgumaCoisa = cliente -> !cliente.
										 getNomesItensComprados().isEmpty();
										
												
	
	public static void main(String[] args) {
		Cliente anonimo = new Cliente();
		Cliente piotr = new Cliente("piotr");
		Cliente pawel = new Cliente("pawel");
		
		Produto kawa = new Produto("kawa", 12.0);
		Produto mientowka = new Produto("mientowka", 35.0);
		
		anonimo.comprar(new Item(kawa, 4));
		anonimo.comprar(new Item(mientowka, 4));
		
		piotr.comprar(new Item(kawa, 9));
		
		System.out.println(anonimo);
		System.out.println(piotr);
		System.out.println(pawel);
		System.out.println();
		
		System.out.println("---> PERGUNTAS");
		System.out.println();
		
		System.out.println(kawa.getNome().toUpperCase().concat("?"));
		System.out.println(comprouKawa.test(anonimo));
		System.out.println(comprouKawa.test(piotr));
		System.out.println(comprouKawa.test(pawel));
		System.out.println();
		
		System.out.println(mientowka.getNome().toUpperCase().concat("?"));
		System.out.println(comprouMientowka.test(anonimo));
		System.out.println(comprouMientowka.test(piotr));
		System.out.println(comprouMientowka.test(pawel));
		System.out.println();
		
		System.out.println("Comprou algo".toUpperCase().concat("?"));
		System.out.println(comprouAlgumaCoisa.test(anonimo));
		System.out.println(comprouAlgumaCoisa.test(piotr));
		System.out.println(comprouAlgumaCoisa.test(pawel));
		System.out.println();
		
	}
}
