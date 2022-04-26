package poo;

public class ProdutoTeste {
	public static void main(String[] args) {
		Produto produto_1 = new Produto();
		Produto produto_2 = new Produto();
		
		System.out.println(produto_1.nome);
		System.out.println(produto_2.nome);
		
		System.out.println(produto_2.valor - produto_1.valor);
		
		Produto produto_3 = new Produto();
		
		produto_3.nome = "Produto específico";
		produto_3.valor = 10.0;
		produto_3.desconto = produto_3.valor * 0.10;
		
		System.out.println(produto_3.nome);
		System.out.println(produto_3.valor - produto_3.desconto);
	}
}
