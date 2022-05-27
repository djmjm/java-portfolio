package streamapi;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

import poo.Comida;


public class FilterExemplo {
	
	private static Consumer<Object> imprimir = System.out::println;
	
	private static Function<Comida, Integer> calorias =
						x -> x.getPeso();
						
	private static BiFunction<Stream<Comida>, Predicate<Integer>, Iterator<Integer>>
						buscar = (x, questao) -> 
							x.map(calorias).filter(questao).iterator()
						;
	
	public static void main(String[] args) {
		Predicate<Integer> maisCalorias = x -> x > 300;
		Predicate<Integer> menosCalorias = x -> !(
											  maisCalorias.test(x)
											);
		
		List<Comida> listaComidas = Arrays.asList(
										new Comida("Sorvete", 207),
										new Comida("Feijão", 347),
										new Comida("Arroz", 130),
										new Comida("Bolacha", 400)
									);
		
		var maisLeves = buscar.apply(listaComidas.stream(), menosCalorias);
		var maisPesadas = buscar.apply(listaComidas.stream(), maisCalorias);
		
		maisLeves.forEachRemaining(imprimir);
		maisPesadas.forEachRemaining(imprimir);
		
	}
}
