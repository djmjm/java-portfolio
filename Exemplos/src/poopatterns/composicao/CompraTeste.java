package poopatterns.composicao;

public class CompraTeste {
	public static void main(String[] args) {
		Compra compra1 = new Compra();
		compra1.addItem(new Item());
		compra1.addItem(new Item());
		compra1.addItem(new Item());
		
		System.out.println(compra1.getCliente());
		
		for(Item item: compra1.getListaItens()) {
			System.out.println(
						item.getArrayAtributos()
					);
		}
		
		System.out.println(
				"Valor total - " + 
				compra1.getValorTotal()
			);
		
		Compra compra2 = new Compra("Pedro");
		compra2.addItem(new Item("Carne", 49, 1));
		compra2.addItem(new Item("Arroz", 28, 1));
		compra2.addItem(new Item("Herva", 6, 2));
		
		System.out.println(compra2.getCliente());
		
		for(Item item: compra2.getListaItens()) {
			System.out.println(
						item.getArrayAtributos()
					);
		}
		
		System.out.println(
					"Valor total - " + 
					compra2.getValorTotal()
				);
		
		Compra compra3 = new Compra("João");
		compra3.addItem(new Item("Herva", 12, 1));
		compra3.addItem(new Item("Coracao galinha", 18, 2));
		
		System.out.println(compra3.getCliente());
		
		for(Item item: compra3.getListaItens()) {
			System.out.println(
						item.getArrayAtributos()
					);
		}
		
		System.out.println(
					"Valor total - " + 
					compra3.getValorTotal()
				);
		
	}
}
