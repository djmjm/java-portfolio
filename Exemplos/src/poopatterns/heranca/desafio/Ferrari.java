package poopatterns.heranca.desafio;

import poopatterns.composicao.Carro;

public class Ferrari extends Carro {
	Ferrari(){
		super(340, 2.0, 3.0);
	}
	
	@Override
	public String toString() {
		return "| FERRARI | " + super.toString();
	}
}
