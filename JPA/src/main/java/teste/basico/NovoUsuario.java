package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

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
					"Douglas", "douglasjanovikmaliszewski@gmail.com"
				)
				;
		
		novoUsuario.setId(444L);
		
		entityManager.getTransaction().begin();;
		entityManager.persist(novoUsuario);
		entityManager.getTransaction().commit();
		
		entityManager.close();
		entityManagerFactory.close();
			
	}
}
