package poopatterns.heranca;

public class Monstro extends Jogador {
	public Monstro() {
		vida = 150;
	}
	
	public Monstro(int x, int y) {
		super(x, y);
		vida = 150;
	}
	
	@Override
	public String toString() {
		return "||Monstro|| " + super.toString();
	}
	
}
