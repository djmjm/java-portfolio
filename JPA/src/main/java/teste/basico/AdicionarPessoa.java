package teste.basico;

import infra.DAO;

import java.util.Scanner;

import exemplo.Pessoa;

public class AdicionarPessoa {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		String nome = leitor.nextLine();
		
		leitor.close();
		
		DAO<Pessoa> dao = new DAO<>();
		
		Pessoa pessoa = new Pessoa(nome);
		
		dao.incluirAtomico(pessoa);
		
		dao.fechar();
	}
}
