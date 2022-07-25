package teste.basico;

import java.util.List;

import infra.ProdutoDAO;
import modelo.basico.Produto;

public class ObterProdutos {
	public static void main(String[] args) {
		ProdutoDAO dao = new ProdutoDAO();
		List<Produto> produtos = dao.obterTodos();
		dao.fechar();
		
		System.out.println(
				"||| Registros tabela produtos |||"
				);
		for(Produto produto : produtos) {
			System.out.println(	"* NOME :: " + produto.getNome()
								+
								" // ID -> " 	 + produto.getId()
								);
		}
	}
}
