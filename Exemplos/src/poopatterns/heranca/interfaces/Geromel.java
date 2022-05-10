package poopatterns.heranca.interfaces;

public class Geromel extends JogadorFutebol implements Zagueiro{
	public Geromel() {
		super(Posicao.ZAGUEIRO);
		nome = "Pedro Geromel".toUpperCase();
	}
	
	@Override
	public String jogar() {
		return desarmar();
	}
	
	@Override
	public String desarmar() {
		return "Desarme preciso".toLowerCase();
	}
}
