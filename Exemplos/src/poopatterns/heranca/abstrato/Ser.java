package poopatterns.heranca.abstrato;

public interface Ser {
	public default boolean estaVivo() {
		return true;
	}
	
	public default String getTipoSer() {
		return "É um animal";
	}

}
