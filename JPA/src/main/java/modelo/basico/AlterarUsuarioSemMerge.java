package modelo.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AlterarUsuarioSemMerge {
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
		
		entityManager.getTransaction().begin();
		
		Usuario usuario =
				entityManager.find(Usuario.class, 1L)
				;
		usuario.setNome("Estou atualizando sem merge ...");
		
		//entityManager.merge(usuario);
		// merge desnecessário, está em estado de transação ..
		// deve atualizar (commit) ..
		
		entityManager.getTransaction().commit();
		
		entityManager.close();
		entityManagerFactory.close();
			
	}
}
