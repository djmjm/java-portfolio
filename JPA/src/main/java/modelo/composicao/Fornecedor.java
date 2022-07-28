package modelo.composicao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "fornecedores")
public class Fornecedor {
	
	@Id
	@GeneratedValue(strategy = 
	GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	private Endereco endereco;
	
	public Fornecedor() {
		// TODO Auto-generated constructor stub
	}
	
	public Fornecedor(String nome, Endereco endereco) {
		super();
		this.nome = nome;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}
	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
}
