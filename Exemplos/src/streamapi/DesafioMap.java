package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

/** retirando warnings (apenas exemplo para estudo) **/
@SuppressWarnings({ "all", "unused"})

public class DesafioMap {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		Integer numeroLido = leitor.nextInt();
		leitor.close();
		
		Consumer<Object> println = System.out::println;
		UnaryOperator<String> reverse = 
				x ->  new StringBuilder().
					  append(x).
					  reverse().toString();
				
		Function<String, Integer> base2 = 
				x -> Integer.parseInt(x, 2);
		Function<Object, Stream<Object>> stream =
				x -> Arrays.asList(x).stream();
				
		
		var original = Integer.toBinaryString(numeroLido).toString();
		System.out.println( Integer.parseInt(
							original, 2)		
						);
		
		
		var reverso = stream.apply(
						base2.apply(
							reverse.apply(original)
							)
						);
		
		
		reverso.forEach(println);
	}
}
