package poopatterns.heranca.abstrato;

public class Pedra implements Ser {
	@Override
	public boolean estaVivo() {
		return false;
	}
	
	@Override
	public String getTipoSer() {
		return "É um objeto";
	}
}
