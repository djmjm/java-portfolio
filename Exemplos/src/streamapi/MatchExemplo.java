package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class MatchExemplo {
	public static void main(String[] args) {
		Predicate<Integer> seculoXXI = n -> n > 2000;
		Predicate<Integer> posSegundaGuerra = n -> n >= 1945;
		
		List<Integer> anos = Arrays.asList(1983, 1995, 2017);
		
		System.out.println( anos.stream().
				allMatch(posSegundaGuerra) 
				);
		
		System.out.println( anos.stream().
				noneMatch(posSegundaGuerra.
						negate()
						) 
				);
		
		System.out.println( anos.stream().
					anyMatch(seculoXXI) 
				);
	}
}
