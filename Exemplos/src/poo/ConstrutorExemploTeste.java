package poo;

public class ConstrutorExemploTeste {
	public static void main(String[] args) {
		ConstrutorExemplo objeto_construtor = new ConstrutorExemplo();
		
		System.out.println(objeto_construtor.construtor1.atributo);
		System.out.println(objeto_construtor.construtor2.atributo);
		System.out.println(objeto_construtor.construtor3.atributo);
		
		objeto_construtor.construtor3.Construtor3();
		
		System.out.println(objeto_construtor.construtor3.atributo);
	}
}
