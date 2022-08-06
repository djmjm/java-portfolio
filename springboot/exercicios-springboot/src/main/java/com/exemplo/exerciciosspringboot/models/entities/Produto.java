package com.exemplo.exerciciosspringboot.models.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produto{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String nome;
	
	private double preco;
	private double desconto;
	
	public Produto() {
		this("Produto Genérico");
	}
	
	public Produto(String nome) {
		super();
		this.nome = nome;
	}
	
	public Produto(String nome,
				double preco, 
				double desconto
				) {
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
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

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	
}
