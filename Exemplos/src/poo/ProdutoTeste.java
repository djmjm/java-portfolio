package poo;

public class ProdutoTeste {
	public static void main(String[] args) {
		Produto produto_1 = new Produto();
		Produto produto_2 = new Produto();
		
		System.out.println(produto_1.getNome());
		System.out.println(produto_2.getNome());
		
		System.out.println(produto_2.getValor() - produto_1.getValor());
		
		Produto produto_3 = new Produto(
				"Produto específico", 10.0, 10.0 * 0.10
				);
		
		System.out.println(produto_3.getNome());
		System.out.println(produto_3.calcularDesconto());
		System.out.println(produto_3.calcularDesconto(produto_3.getDesconto()));
	}
}
