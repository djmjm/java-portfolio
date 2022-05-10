package poopatterns.heranca.abstrato;

public class Tigre extends Animal {

	@Override
	public boolean comer(Alimento alimento) {
		return alimento == Alimento.CARNE;
	}

}
