package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class MapExemplo {
	public static void main(String[] args) {
		Consumer<Object> print = System.out::println;
		UnaryOperator<String> maiuscula = x -> x.toUpperCase();
		
		Function<String, Boolean> video = 
				x -> x.equalsIgnoreCase("Nvidia") ||
					 x.equalsIgnoreCase("ATI")
					 ? true : false;
				
		Function<String, Boolean> cpu = 
				x -> x.equalsIgnoreCase("Intel") ||
					 x.equalsIgnoreCase("AMD")
					 ? true : false;
							
		
		List<String> tecnologia = Arrays.asList(
								"Intel", "AMD",
								"Nvidia", "ATI"
							 );
		
		tecnologia.stream().map(maiuscula).forEach(print);
		System.out.println();
		tecnologia.stream().map(video).forEach(print);
		System.out.println();
		tecnologia.stream().map(cpu).forEach(print);
	}
}
