package excecao.personalizada;

public class Aluno {
	private String nome;
	private Integer nota;
	
	public Aluno(String nome, int nota) 
	throws RuntimeException{
		boolean stringVazia = nome.equals("") 
						      || nome == null;
		
		boolean notaNegativa = nota < 0;
		
		if(stringVazia) throw new NomeVazioException();
		if(notaNegativa) throw new NotaNegativaException(nota);
		
		this.nome = nome;
		this.nota = nota;
	}
}
