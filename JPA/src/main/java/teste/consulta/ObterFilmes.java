package teste.consulta;

import java.util.List;

import infra.DAO;
import muitospramuitos.Ator;
import muitospramuitos.Filme;

public class ObterFilmes {
	public static void main(String[] args) {
		DAO<Filme> dao = new DAO<>(Filme.class);
		List<Filme> filmes = dao.consultar(
				"obterFilmesComNotaMaiorQue", 
				"nota", 10.0
				)
				;
		dao.fechar();
		for(Filme filme: filmes) {
			System.out.println("|| " + filme.getNome() + " ||");
			System.out.println("Atores participantes -->>");
			List<Ator> atores = filme.getAtores();
			
			for(Ator ator : atores) {
				System.out.println(
						ator.getNome()
						);
			}
			System.out.println();
		}
	}
}
