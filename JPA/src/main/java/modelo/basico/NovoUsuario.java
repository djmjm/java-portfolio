package modelo.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class NovoUsuario {
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
		
		Usuario novoUsuario = new Usuario(
					"ok", "sure@gmail.com"
				)
				;
		
		novoUsuario.setId(86L);
		
		entityManager.getTransaction().begin();;
		entityManager.persist(novoUsuario);
		entityManager.getTransaction().commit();
		
		entityManager.close();
		entityManagerFactory.close();
			
	}
}
