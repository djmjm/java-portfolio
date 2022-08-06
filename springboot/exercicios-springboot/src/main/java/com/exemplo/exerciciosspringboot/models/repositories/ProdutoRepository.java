package com.exemplo.exerciciosspringboot.models.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.exemplo.exerciciosspringboot.models.entities.Produto;

public interface ProdutoRepository 
extends PagingAndSortingRepository<Produto, Integer> {
	public Iterable<Produto> 
		findByNomeContaining(
			String parteNome
		)
	;
	
	@Query(value = "SELECT nome AS nomes FROM produto", nativeQuery = true)
	public Iterable<String> findAllNomes();
}
