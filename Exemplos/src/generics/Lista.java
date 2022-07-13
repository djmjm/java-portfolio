package generics;

import java.util.List;

public class Lista <T> {
	public T getUltimo(List<T> lista) {
		return lista.get(lista.size() - 1);
	}
}
