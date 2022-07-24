package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class RemoverUsuario {
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
				entityManager.find(Usuario.class, 84L)
				;
		
		if(usuario != null) {
			entityManager.getTransaction().begin();
			
			entityManager.remove(usuario);
			
			entityManager.getTransaction().commit();
		}
		
		entityManager.close();
		entityManagerFactory.close();
	}
}
