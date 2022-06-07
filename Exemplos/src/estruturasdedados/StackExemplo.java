package estruturasdedados;

import java.util.ArrayDeque;
import java.util.Deque;

/** retirando warnings (apenas exemplo para estudo) **/
@SuppressWarnings({ "all", "unused"})

public class StackExemplo {
	public static void main(String[] args) {
		Deque fila = new ArrayDeque();
		
		for(int i = 0; i < 10; i++) {
			fila.push(i+1);
		}
		
		while(!fila.isEmpty()) 
			System.out.println(fila.pop());
	}
}
