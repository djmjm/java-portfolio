package excecao.personalizada;

@SuppressWarnings("serial")
public class NomeVazioException extends RuntimeException{
	@Override
	public String getMessage() {
		return "EXCEÇÃO -->> Nome não pode ser vazio.";
	}
}
