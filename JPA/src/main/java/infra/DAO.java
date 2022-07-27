package infra;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

//import modelo.basico.Entidade; 
// comentado, sem uso no momento ...
// relembrar conceito entidade marcação.

public class DAO <E> {
	private static 
		EntityManagerFactory 
		entityManagerFactory;

	private EntityManager 
			entityManager;
	
	private Class<E> classe;
	
	static {
		try {
			entityManagerFactory =
					Persistence.
					createEntityManagerFactory(
							"Exemplos-jpa"
							)
					;
		}
		catch(Exception e) {
			
		}
	}
	
	public DAO() {
		this(null);
	}
	
	public DAO(Class<E> classe) {
		this.classe = classe;
		
		entityManager = entityManagerFactory.
						createEntityManager()
						;
	}
	
	public DAO<E> abrirT(){
		entityManager.getTransaction().begin();
		return this;
	}
	
	public DAO<E> fecharT(){
		entityManager.getTransaction().commit();
		return this;
	}
	
	public DAO<E> incluir(E entidade){
		entityManager.persist(entidade);
		return this;
	}
	
	public DAO<E> incluirAtomico(E entidade){
		return this.abrirT().incluir(entidade).fecharT();
	}
	
	public List<E> obterTodos(){
		return obterTodos(99999, 0);
	}
	
	public List<E> obterTodos(
			int quantidadeRegistros,
			int deslocamento
			){
		if(classe == null) {
			throw new UnsupportedOperationException(
						"Classe nula ..."
					)
			;
		}
		
		String jpql = "select e from "
					  + classe.getName()
					  + " e"
					  ;
		TypedQuery<E> query = entityManager.
							  createQuery(jpql, classe)
							  ;
		query.setMaxResults(quantidadeRegistros);
		query.setFirstResult(deslocamento);
		return query.getResultList();
	}
	
	public E obterPorId(Object id) {
		return entityManager.find(classe, id);
	}
	
	public List<E> consultar(
			String nomeConsulta,
			Object... params
			){
		TypedQuery<E> query =
				entityManager.
				createNamedQuery(
						nomeConsulta, classe
						)
				;
		
		for(int i = 0; i < params.length; i += 2) {
			query.setParameter(
					params[i].toString(), 
					params[i + 1]
			)
			;
		}
		
		return query.getResultList();
	}
	
	public void fechar() {
		entityManager.close();
		entityManagerFactory.close();
	}
}
