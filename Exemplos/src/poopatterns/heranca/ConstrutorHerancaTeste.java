package poopatterns.heranca;

public class ConstrutorHerancaTeste {
	public static void main(String[] args) {
		PrimeiroConstrutor primeiro = new PrimeiroConstrutor();
		SegundoConstrutor segundo = new SegundoConstrutor();
		TerceiroConstrutor terceiro = new TerceiroConstrutor();
		
		System.out.println(primeiro.getPrimeiroAtributo());
		System.out.println();
		System.out.println(segundo.getPrimeiroAtributo());
		System.out.println(segundo.getSegundoAtributo());
		System.out.println();
		System.out.println(terceiro.getPrimeiroAtributo());
		System.out.println(terceiro.getSegundoAtributo());
		System.out.println(terceiro.getTerceiroAtributo());
		System.out.println();
		
		PrimeiroConstrutor primeiroPersonalizado = new PrimeiroConstrutor("João".toUpperCase());
		SegundoConstrutor segundoPersonalizado = new SegundoConstrutor("maria".toUpperCase());
		TerceiroConstrutor terceiroPersonalizado = new TerceiroConstrutor("josé".toUpperCase());
		
		System.out.println(primeiroPersonalizado.getPrimeiroAtributo());
		System.out.println();
		System.out.println(segundoPersonalizado.getPrimeiroAtributo());
		System.out.println(segundoPersonalizado.getSegundoAtributo());
		System.out.println();
		System.out.println(terceiroPersonalizado.getPrimeiroAtributo());
		System.out.println(terceiroPersonalizado.getSegundoAtributo());
		System.out.println(terceiroPersonalizado.getTerceiroAtributo());
		System.out.println();
	}
}
