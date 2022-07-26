package umpraum;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Assento {
	@Id
	@GeneratedValue(
	strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@OneToOne(mappedBy = "assento")
	private Cliente cliente;
	
	public Assento(String nome) {
		super();
		this.nome = nome;
	}

	public Assento() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
