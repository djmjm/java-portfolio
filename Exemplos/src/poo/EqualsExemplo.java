package poo;

public class EqualsExemplo {
	public static void main(String[] args) {
		Usuario usuario1 = new Usuario();
		Usuario usuario2 = new Usuario();
		
		System.out.println(usuario1 == usuario2);
		System.out.println(usuario1.equals(usuario2));
		
		usuario2.mudarNome("Grêmio");
		System.out.println(usuario1 == usuario2);
		System.out.println(usuario1.equals(usuario2));
		
		usuario1 = usuario2;
		System.out.println(usuario1 == usuario2);
		System.out.println(usuario1.equals(usuario2));
	}
}
