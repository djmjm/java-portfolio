package excecao.personalizada;

public class ExcecaoPersonalizadaExemplo {
	public static void main(String[] args) {
		try {
			new Aluno("", -10);
		}catch(NomeVazioException e) {
			System.out.println(e.getMessage());
		}finally{
			try {
				new Aluno("Paulo", -10);
			}catch(NotaNegativaException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
