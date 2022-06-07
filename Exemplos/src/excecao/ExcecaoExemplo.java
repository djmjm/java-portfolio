package excecao;

import poopatterns.composicao.Aluno;

/** retirando warnings (apenas exemplo para estudo) **/
@SuppressWarnings({ "all", "unused"})

public class ExcecaoExemplo {
	public static void main(String[] args) {
		
		int vetor[] = new int[10];
		try {
			vetor[20] = 1983;
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		
		Aluno aluno = null;
		try {
			aluno.inscreverCurso(null);
		}catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			System.out.println(0/0);
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
