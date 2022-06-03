package excecao.personalizada;

@SuppressWarnings("serial")
public class NotaNegativaException extends RuntimeException {
	
	private int nomeAtributo;
	
	public NotaNegativaException(int nomeAtributo) {
		this.nomeAtributo = nomeAtributo;
	}
	
	@Override
	public String getMessage() {
		return "EXCEÇÃO -->> Nota não pode ser negativa."
				+ "\n"
				+"Parâmetro: " + nomeAtributo;
	}
}
