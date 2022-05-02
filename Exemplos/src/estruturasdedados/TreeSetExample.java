package estruturasdedados;

import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		TreeSet<String> nomesOrdenados = new TreeSet<String>();
		
		nomesOrdenados.add("Nome 1");
		nomesOrdenados.add("Nome 2");
		nomesOrdenados.add("Nome 3");
		nomesOrdenados.add("Nome 4");
		nomesOrdenados.add("Nome 5");
		
		System.out.println(nomesOrdenados);
	}
}
