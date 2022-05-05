package poopatterns.composicao;

import java.util.ArrayList;
import java.util.List;

public class Curso {
	private final String nome;
	private final List<Aluno> listaAlunos = new ArrayList<Aluno>();
	
	public Curso() {
		this("Contabilidade");
	}
	
	public Curso(String nome) {
		this.nome = nome.toLowerCase();
	}
	
	public void matricularAluno(Aluno aluno) {
		if(!listaAlunos.contains(aluno)) {
			listaAlunos.add(aluno);
			aluno.inscreverCurso(this);
		}
	}
	
	public List<Aluno> getListaAlunos(){
		return listaAlunos;
	}
	
	public String toString() {
		return nome;
	}
}
