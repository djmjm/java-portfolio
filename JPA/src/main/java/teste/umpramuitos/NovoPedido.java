package teste.umpramuitos;

import infra.DAO;
import modelo.basico.Produto;
import umpramuitos.ItemPedido;
import umpramuitos.Pedido;

public class NovoPedido {
	public static void main(String[] args) {
		DAO<Object> dao =
				new DAO<>()
				;
		
		Pedido pedido = new Pedido();
		
		Produto produto = 
				new Produto("Carro", 39999.0);
		ItemPedido item = 
				new ItemPedido(pedido, produto, 10)
				;
		
		dao.abrirT().
			incluir(produto).
			incluir(pedido).
			incluir(item).
			fecharT().
			fechar()
			;
	}
}
