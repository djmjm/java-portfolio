package poopatterns.heranca.interfaces;

public class Neuer extends JogadorFutebol implements Goleiro{
	public Neuer() {
		super(Posicao.GOLEIRO);
		nome = "Manuel Neuer".toUpperCase();
	}
	
	@Override
	public String jogar() {
		return jogarComMaos();
	}
	
	@Override
	public String jogarComMaos() {
		return "Defesa de reflexo".toLowerCase();
	}
}
