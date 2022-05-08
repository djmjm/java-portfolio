package poopatterns.heranca;

public class Heroi extends Jogador {
	public Heroi() {
		vida = 110;
	}
	
	public Heroi(int x, int y) {
		super(x, y);
		vida = 110;
	}
	
	public void atacar(Jogador jogador) {
		super.atacar(jogador);
		super.atacar(jogador);
	}
	
	@Override
	public String toString() {
		return "||Heroi|| " + super.toString();
	}
}
