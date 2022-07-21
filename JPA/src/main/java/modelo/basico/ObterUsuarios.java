package modelo.basico;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class ObterUsuarios {
	public static void main(String[] args){
		EntityManagerFactory entityManagerFactory =
				Persistence.createEntityManagerFactory(
							"Exemplos-jpa"
						)
				;
		EntityManager entityManager =
				entityManagerFactory.
				createEntityManager()
				;
		
		String jpql = "select u from Usuario u";
		TypedQuery<Usuario> query = 
				entityManager.createQuery(jpql, Usuario.class);
		
		query.setMaxResults(2);
		
		List<Usuario> usuarios = 
				query.getResultList()
				;
		
		entityManager.close();
		entityManagerFactory.close();
		
		System.out.println("");
		for(Usuario usuario: usuarios) {
			System.out.println( "ID -->> " + usuario.getId() );
			System.out.println( "Email -->> " + usuario.getEmail() );
		}
		
	}
}
