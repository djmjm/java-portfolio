package funcional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SuplierExemplo {
	
	private static Supplier<List<String>> listaUm = 
			() -> Arrays.asList("Douglas", "Pedro", "João", "Maria");
	
	public static void main(String[] args) {
		System.out.println(listaUm.get());
		System.out.println(listaUm.get().contains("Douglas"));
		System.out.println(listaUm.get().contains("Marcos"));
	}
}
