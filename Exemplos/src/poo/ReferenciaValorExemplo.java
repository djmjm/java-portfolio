package poo;

public class ReferenciaValorExemplo {
	public static void main(String[] args) {
		char letra_inicial1 = 'a';
		char letra_inicial2 = 'b';
		
		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa();
		
		System.out.println(letra_inicial1);
		System.out.println(letra_inicial2);
		System.out.println();
		
		letra_inicial1 = letra_inicial2;
		
		System.out.println(letra_inicial1);
		System.out.println(letra_inicial2);
		System.out.println();
		
		letra_inicial1 = pessoa2.getLetraInicial();
		
		System.out.println(letra_inicial1);
		System.out.println(letra_inicial2);
		System.out.println();
		
		pessoa2.mudarNome("Soldado Ryan");
		letra_inicial2 = pessoa2.getLetraInicial();
		
		System.out.println(letra_inicial1);
		System.out.println(letra_inicial2);
		System.out.println();
		
		pessoa1.mudarNome("Capitão Miller");
		System.out.println(pessoa1.getNome());
		System.out.println(pessoa2.getNome());
		System.out.println();
		
		pessoa1 = pessoa2;
		System.out.println(pessoa1.getNome());
		System.out.println(pessoa2.getNome());
		System.out.println();
		
		pessoa2.mudarNome("James Francis Ryan");
		System.out.println(pessoa1.getNome());
		System.out.println(pessoa2.getNome());
		System.out.println();
		
		pessoa1.mudarNome("Steven Spielberg");
		System.out.println(pessoa1.getNome());
		System.out.println(pessoa2.getNome());
		System.out.println();
		
		pessoa2 = new Pessoa();
		System.out.println(pessoa1.getNome());
		System.out.println(pessoa2.getNome());
		System.out.println();
		
		
		
	}
}
