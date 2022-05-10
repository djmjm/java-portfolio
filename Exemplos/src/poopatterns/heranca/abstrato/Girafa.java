package poopatterns.heranca.abstrato;

public class Girafa extends Animal {

	@Override
	public boolean comer(Alimento alimento) {
		return alimento == Alimento.VEGETAL;
	}

}
