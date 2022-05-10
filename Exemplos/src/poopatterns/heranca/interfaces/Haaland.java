package poopatterns.heranca.interfaces;

public class Haaland extends JogadorFutebol implements Atacante{
	public Haaland() {
		super(Posicao.ATACANTE);
		nome = "Erling Haaland".toUpperCase();
	}
	
	@Override
	public String jogar() {
		return finalizar();
	}
	
	@Override
	public String finalizar() {
		return "Chute forte".toLowerCase();
	}
	
}
