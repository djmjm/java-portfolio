package estruturasdedados;

import java.util.Objects;

public class ClubesFutebol {
	private String nome;
	private String cidade;
	private int anoFundacao;
	
	public ClubesFutebol() {
		nome = "Grêmio".toLowerCase();
		cidade = "Porto Alegre".toLowerCase();
		anoFundacao = 1903;
	}
	
	public ClubesFutebol(String nome, String cidade, int anoFundacao) {
		this.nome = nome.toLowerCase();
		this.cidade = cidade.toLowerCase();
		this.anoFundacao = anoFundacao;
	}

	@Override
	public int hashCode() {
		return Objects.hash(anoFundacao, cidade, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ClubesFutebol other = (ClubesFutebol) obj;
		return anoFundacao == other.anoFundacao && Objects.equals(cidade, other.cidade)
				&& Objects.equals(nome, other.nome);
	}
	
	
	
}
