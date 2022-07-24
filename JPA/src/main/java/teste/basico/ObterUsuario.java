package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class ObterUsuario {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory =
				Persistence.createEntityManagerFactory(
							"Exemplos-jpa"
						)
				;
		EntityManager entityManager =
				entityManagerFactory.
				createEntityManager()
				;
		
		Usuario usuario = 
				entityManager.find(Usuario.class, 1L)
				;
		
		entityManager.close();
		entityManagerFactory.close();
		
		System.out.println(usuario.getNome());
		System.out.println(usuario.getEmail());
	}
}
