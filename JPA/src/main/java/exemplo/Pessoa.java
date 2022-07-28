package exemplo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pessoa {
	
	@Id
	private String nome;
	
	private String sobrenome = "Maliszewski";

	public Pessoa() {
		// TODO Auto-generated constructor stub
	}
	public Pessoa(String nome) {
		super();
		this.nome = nome;
	}
	
}
