package streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetosExemplo {
	public static void main(String[] args) {
		List<String> libertadores = Arrays.asList(
										"1983", "1995", "2017"
									);
		
		System.out.println(libertadores);
		System.out.println();
		
		for(String ano: libertadores) {
			System.out.println(ano);
		}
		System.out.println();
		
		Iterator<String> iterator = libertadores.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println();
		
		Stream<String> stream = libertadores.stream();
		stream.forEach(System.out::println);
		System.out.println();
	}
}
