package estruturasdedados;

import java.util.ArrayList;

import poo.Usuario;

public class ListExemplo {
	public static void main(String[] args) {
		ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();
		
		listaUsuarios.add(new Usuario());
		listaUsuarios.add(new Usuario());
		listaUsuarios.add(new Usuario());
		
		for(Usuario indice: listaUsuarios) {
			System.out.println(indice.getNome());
		}
		
		listaUsuarios.get(
					listaUsuarios.size() - 1
				).mudarNome("Blablabla");
		
		for(Usuario indice: listaUsuarios) {
			System.out.println(indice.getNome());
		}
		
	}
}
