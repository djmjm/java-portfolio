package fundamentos;

public class OperadoresAritmeticos {
	public static void main(String[] args) {
		int numero = 10;
		
		System.out.println(numero + numero);
		System.out.println(numero - numero);
		System.out.println(numero * numero);
		System.out.println(numero / numero);
		
		numero = 10;
		System.out.println(numero * ++numero);
		numero = 10;
		System.out.println(numero * numero++);
		
		numero = 5;
		
		for(int i = 0; i < 10; i++)
			System.out.print(i % numero);
		
		String resposta_1 = (numero > 5) ? "SIM"
					 : "NÃO";
		
		String resposta_2 = (numero < 10) ? "SIM"
				 : "NÃO";
		
		System.out.println();
		System.out.println(resposta_1);
		System.out.println(resposta_2);
			
	}
}
