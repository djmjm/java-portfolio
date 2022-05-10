package poopatterns.heranca.interfaces;

public class JogadorFutebol {
	private Posicao posicao;
	protected String nome = "Pelé";
	
	public JogadorFutebol() {
		this(Posicao.ATACANTE);
	}
	
	public JogadorFutebol(Posicao posicao) {
		this.posicao = posicao;
	}
	
	public String jogar() {
		return "passe simples";
	}
	
	public String getNome() {
		return nome;
	}
	
	@Override
	public String toString() {
		switch(posicao) {
			case GOLEIRO: return nome + " - " + "GOLEIRO".toLowerCase();
			case ATACANTE: return nome + " - " + "ATACANTE".toLowerCase();
			default: return nome + " - " + "ZAGUEIRO".toLowerCase();
		}
	}
}
