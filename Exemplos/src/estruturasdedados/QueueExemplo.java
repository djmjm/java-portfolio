package estruturasdedados;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExemplo {
	public static void main(String[] args) {
		Queue fila = new LinkedList();
		
		for(int i = 0; i < 10; i++) {
			fila.offer(i+1);
		}
		
		while(!fila.isEmpty()) 
			System.out.println(fila.poll());
		
	}
}
