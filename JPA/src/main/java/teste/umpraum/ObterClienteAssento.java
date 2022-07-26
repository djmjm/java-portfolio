package teste.umpraum;

import infra.DAO;
import umpraum.Cliente;

public class ObterClienteAssento {
	public static void main(String[] args) {
		DAO<Cliente> dao =
				new DAO<Cliente>(Cliente.class)
				;
		Cliente cliente = dao.obterPorId(1L);
		System.out.println(  
					cliente.getAssento().
					getNome()
				);
		System.out.println(  
				cliente.getAssento().
				getCliente().
				getNome()
			);
		dao.fechar();
	}
}
