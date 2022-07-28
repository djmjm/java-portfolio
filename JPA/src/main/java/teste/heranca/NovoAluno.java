package teste.heranca;

import infra.DAO;
import modelo.heranca.*;

public class NovoAluno {
	public static void main(String[] args) {
		DAO<Aluno> alunoDAO = new DAO<>();
		
		Aluno aluno = new Aluno(123L, "João");
		AlunoBolsista aluno2 = 
				new AlunoBolsista(1L, "Arthur", 1212.0)
				;
		
		alunoDAO.incluirAtomico(aluno);
		alunoDAO.incluirAtomico(aluno2);
		
		alunoDAO.fechar();
	}
}
