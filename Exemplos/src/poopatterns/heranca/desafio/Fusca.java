package poopatterns.heranca.desafio;

import poopatterns.composicao.Carro;

public class Fusca extends Carro{
	public Fusca() {
		super(144, 1, 1);
	}
	
	@Override
	public String toString() {
		return "| FUSCA | " + super.toString();
	}
}
