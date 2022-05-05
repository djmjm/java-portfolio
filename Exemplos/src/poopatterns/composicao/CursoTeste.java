package poopatterns.composicao;

public class CursoTeste {
	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		Curso curso2 = new Curso("Computação");
		Curso curso3 = new Curso("Direito");
		
		System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(curso3);
		System.out.println();
		
		Aluno aluno1 = new Aluno();
		Aluno aluno2 = new Aluno("maria");
		Aluno aluno3 = new Aluno("José");
		
		System.out.println(aluno1);
		System.out.println(aluno2);
		System.out.println(aluno3);
		System.out.println();
		
		for(int i = 0; i < 3; i++) {
			curso1.matricularAluno(aluno3);
			curso1.matricularAluno(aluno3);
			
			aluno1.inscreverCurso(curso1);
			aluno1.inscreverCurso(curso3);
			
			curso2.matricularAluno(aluno3);
			curso2.matricularAluno(aluno2);
			curso2.matricularAluno(aluno1);
		}
		
		System.out.println();
		System.out.println("--- Lista cursos ---");
		System.out.println(curso1 + " - " + curso1.getListaAlunos());
		System.out.println(curso2 + " - " + curso2.getListaAlunos());
		System.out.println(curso3 + " - " + curso3.getListaAlunos());
		
		System.out.println();
		System.out.println("--- Lista alunos ---");
		System.out.println(aluno1 + " - " + aluno1.getListaCursos());
		System.out.println(aluno2 + " - " + aluno2.getListaCursos());
		System.out.println(aluno3 + " - " + aluno3.getListaCursos());
	
	}
}
