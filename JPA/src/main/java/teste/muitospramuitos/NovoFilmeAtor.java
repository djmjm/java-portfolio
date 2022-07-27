package teste.muitospramuitos;

import infra.DAO;
import muitospramuitos.Ator;
import muitospramuitos.Filme;

public class NovoFilmeAtor {
	public static void main(String[] args) {
		Filme filmeA = 
				new Filme(
						"Star Wars - the revenge of the sith",
						10.0
						)
				;
		Filme filmeB = 
				new Filme(
						"Qualquer filme do Nicolas Cage",
						10.0 + 1.0
						)
				;
		Ator atorA = new Ator("Harrison Ford");
		Ator atorB = new Ator("Mark Hamill");
		Ator atorC = new Ator("Adam Sandler");
		
		filmeA.adicionarAtor(atorB);
		filmeA.adicionarAtor(atorA);
		
		filmeB.adicionarAtor(atorC);
		filmeB.adicionarAtor(atorA);
		
		DAO<Filme> dao = new DAO<Filme>();
		dao.incluirAtomico(filmeA);
		dao.incluirAtomico(filmeB);
		dao.fechar();
		
	}
}
