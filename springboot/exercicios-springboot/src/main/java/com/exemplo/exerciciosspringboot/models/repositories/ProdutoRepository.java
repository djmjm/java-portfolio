package com.exemplo.exerciciosspringboot.models.repositories;

import org.springframework.data.repository.CrudRepository;

import com.exemplo.exerciciosspringboot.models.entities.Produto;

public interface ProdutoRepository 
extends CrudRepository<Produto, Integer> {
	
}
