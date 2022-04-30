package poo;

public class Jantar {
	public static void main(String[] args) {
		ClienteJantar cliente1 = new ClienteJantar();
		ClienteJantar cliente2 = new ClienteJantar("Douglas");
		ClienteJantar cliente3 = new ClienteJantar("Joaquim", 74);
		
		Comida churrasco = new Comida();
		Comida salada = new Comida("Salada", 1);
		Comida sobremesa = new Comida("Sobremesa", 9999);
		
		System.out.println("ANTES JANTAR ...");
		
		System.out.println();
		
		System.out.print(cliente1.getNome());
		System.out.print(" - ");
		System.out.println(cliente1.getPeso() + "KG");
		
		System.out.print(cliente2.getNome());
		System.out.print(" - ");
		System.out.println(cliente2.getPeso() + "KG");
		
		System.out.print(cliente3.getNome());
		System.out.print(" - ");
		System.out.println(cliente3.getPeso() + "KG");
		
		System.out.println();
		
		cliente1.comer(churrasco);
		System.out.println(
					cliente1.getNome() + " comeu " +
					churrasco.getNome()
				);
		
		cliente2.comer(sobremesa);
		System.out.println(
				cliente2.getNome() + " comeu " +
				sobremesa.getNome()
			);
		
		cliente3.comer(salada);
		System.out.println(
				cliente1.getNome() + " comeu " +
				salada.getNome()
			);
		
		System.out.println();
		
		System.out.println("APÓS JANTAR ...");
		
		System.out.print(cliente1.getNome());
		System.out.print(" - ");
		System.out.println(cliente1.getPeso() + "KG");
		
		System.out.print(cliente2.getNome());
		System.out.print(" - ");
		System.out.println(cliente2.getPeso() + "KG");
		
		System.out.print(cliente3.getNome());
		System.out.print(" - ");
		System.out.println(cliente3.getPeso() + "KG");
	}
}
