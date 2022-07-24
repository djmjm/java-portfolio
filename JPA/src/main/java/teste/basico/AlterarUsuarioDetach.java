package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuarioDetach {
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
		Usuario usuario;
		
		entityManager.getTransaction().begin();
		
		usuario = entityManager.find(Usuario.class, 1L);
		usuario.setNome("Não vai atualizar!");
		entityManager.detach(usuario);
		
		entityManager.getTransaction().commit();
		
		entityManager.getTransaction().begin();
		
		usuario = entityManager.find(Usuario.class, 1L);
		usuario.setNome("Vai atualizar com merge!");
		entityManager.detach(usuario);
		
		entityManager.merge(usuario);
		
		entityManager.getTransaction().commit();
		
		entityManager.close();
		entityManagerFactory.close();
			
	}
}
