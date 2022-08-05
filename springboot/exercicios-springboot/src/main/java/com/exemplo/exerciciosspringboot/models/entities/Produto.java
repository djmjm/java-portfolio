package com.exemplo.exerciciosspringboot.models.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Produto {
	@Id
	private int id;
	private String nome;
	
	public Produto() {
		this("Produto Genérico");
	}
	
	public Produto(String nome) {
		super();
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	
	
}
