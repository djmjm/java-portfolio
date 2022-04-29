package poo;

public class ConstrutorExemplo {
	
	public Construtor1 construtor1;
	public Construtor2 construtor2;
	public Construtor3 construtor3;
	
	ConstrutorExemplo() {
		construtor1 = new Construtor1();
		construtor2 = new Construtor2();
		construtor3 = new Construtor3();
	}
	
	public class Construtor1{
		public int atributo = 1;
	}
	
	public class Construtor2{
		public int atributo;
		Construtor2() {
			atributo = 1;
		}
		Construtor2(int parametro){
			atributo = parametro;
		}
	}
	
	public class Construtor3{
		public int atributo = 2;
		public void Construtor3() {
			atributo = 1;
		}
	}
}
