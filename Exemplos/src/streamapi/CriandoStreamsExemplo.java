package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class CriandoStreamsExemplo {
	
	private static void quebrarLinha() {
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		Consumer<Object> println = System.out::println;
		Consumer<Object> print = System.out::print;
		
		Supplier<List<String>> funcionalLangs = () -> Arrays.asList(
											"Lisp",
											"Haskell", 
											"Erlang",
											"Clojure"
										  );
		
		Stream<String> langs = Stream.of(
									"Java", " - ",
									"Cpp", " - ",
									"Cobol", " - ",
									"Fortran", " - ",
									"Assembly", "\n"
								);
		langs.forEach(print);
		quebrarLinha();
		
		String[] webLangs = { "JavaScript", "CSS", "HTML", "PHP" };
		
		Stream.of(webLangs).forEach(println);
		quebrarLinha();
		
		Arrays.stream(webLangs, webLangs.length/2, 
					  webLangs.length).
					  forEach(println);
		quebrarLinha();
		
		var funcLangs = Stream.generate(funcionalLangs);
		var linguagensListadas = funcLangs.findFirst().toString();
		
		System.out.println(
					linguagensListadas.contains("Haskell")
				);
		
		System.out.println(
				linguagensListadas.contains("Clojure")
			);
		
		System.out.println(
				linguagensListadas.contains("Cpp")
			);
		
	}
}
