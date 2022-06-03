package excecao.personalizada;

public class Finally {
	public static void main(String[] args) {
		int indice = -10;
		int vetor[] = new int[1];
		
		while(indice < 1) {
			try {
				vetor[indice] = 1983;
			}catch(IndexOutOfBoundsException e) {
				System.out.println(e.getMessage());
			}finally {
				indice++;
			}
		}
		System.out.println(vetor[0]);
	}
}
