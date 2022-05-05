package poopatterns.composicao;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	private final String nome;
	private final List<Curso> listaCursos = new ArrayList<Curso>();
	
	public Aluno() {
		this("Anônimo");
	}
	
	public Aluno(String nome) {
		this.nome = nome.toUpperCase();
	}
	
	public void inscreverCurso(Curso curso) {
		if(!listaCursos.contains(curso)) {
			listaCursos.add(curso);
			curso.matricularAluno(this);
		}
		
	}
	
	public List<Curso> getListaCursos(){
		return listaCursos;
	}
	
	public String toString() {
		return nome;
	}
}
