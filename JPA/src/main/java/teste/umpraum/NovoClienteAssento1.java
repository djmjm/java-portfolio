package teste.umpraum;

import infra.DAO;
import umpraum.Assento;
import umpraum.Cliente;

public class NovoClienteAssento1 {
	public static void main(String[] args) {
		Assento assento = new Assento("1C");
		Cliente cliente = new Cliente("João", assento);
		
		DAO<Object> dao = new DAO<>();
		dao.abrirT().incluir(assento).
					 incluir(cliente).
					 fecharT().
					 fechar()
					 ;
	}
}
