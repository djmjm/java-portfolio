package exercicios;

// funcionamento semelhante ao GOTO (não recomendado).
public class BreakRotuladoExemplo {
	public static void main(String[] args) {
		int contador = 0;
		
		FIM:do {
				MEIO:while(true){
					System.out.println(contador++);
					if(contador == 10) break FIM;
					break MEIO;
				}
			}while(true);
			
			
	}
}
