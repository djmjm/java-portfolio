package funcional;

import java.util.function.UnaryOperator;

public class OperadorUnarioExemplo {
	
	private static UnaryOperator<Integer> somaUm = (x) -> ++x;
	
	public static void main(String[] args) {
		Integer x = 0;
		while(x < 100) {
			x = somaUm.apply(x);
			System.out.println(x);
		}
	}
	
}
