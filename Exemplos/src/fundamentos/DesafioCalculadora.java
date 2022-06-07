package fundamentos;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

/** retirando warnings (apenas exemplo para estudo) **/
@SuppressWarnings({ "all", "unused"})

public class DesafioCalculadora {
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		String linha = leitor.nextLine();
		System.out.println(linha);
		leitor.close();
		
		ArrayList lista_numeros = new ArrayList<Double>();
		ArrayList lista_operadores = new ArrayList<String>();
		ArrayList lista_infix = new ArrayList<String>();
		Scanner parser = new Scanner(linha);
		while(parser.hasNext()) {
			var token = parser.next();
			lista_infix.add(token);
			try {
				System.out.println(Double.valueOf(token));
				lista_numeros.add(Double.valueOf(token));
			}catch(NumberFormatException e) {
				System.out.println(token);
				lista_operadores.add(token);
			}
		}parser.close();
		
		System.out.println(lista_numeros);
		System.out.println(lista_operadores);
		System.out.println(lista_infix);
		new Calculadora(lista_infix);
	}
}

class Calculadora{
	
	final boolean MAIOR_PRECEDENCIA = true;
	final boolean MENOR_PRECEDENCIA = false;
	
	private ArrayList<Operacao> lista_operacoes;
	public Calculadora() {
		lista_operacoes = new ArrayList<Operacao>();
		
		lista_operacoes.add(new Operacao(1.0, 1.0, "+"));
		Operacao op = lista_operacoes.get(0);
		op.calcular();
		System.out.println(op.getResultado());
	}
	
	public Calculadora(
			ArrayList<Double> lista_numeros,
			ArrayList<String> lista_operadores
		) {
		System.out.println(lista_numeros);
		System.out.println(lista_operadores);
	}
	
	public Calculadora(ArrayList<String> lista_infix) {
		converterParaNotacaoPosfixa(lista_infix);
	}
	
	private void converterParaNotacaoPosfixa(
			ArrayList<String> lista_infix
			) {
		ArrayDeque<String> fila = new ArrayDeque<String>();
		Stack<String> pilha = new Stack<String>();
		
		while( !lista_infix.isEmpty() ) {
			String token = lista_infix.get(0);
			
			if(!this.checarNumero(token)){
				try {
					boolean precedencia_topo_pilha = checarPrecedencia(pilha.peek());
					boolean precedencia_operacao_lida = checarPrecedencia(token);
							
					if(pilha.isEmpty()) {
						pilha.push(token);
					}else {
						if(precedencia_operacao_lida == MAIOR_PRECEDENCIA
							&&
							precedencia_topo_pilha == MENOR_PRECEDENCIA
								) {
							pilha.push(token);
						}else if(precedencia_operacao_lida == MENOR_PRECEDENCIA
								&&
								precedencia_topo_pilha == MAIOR_PRECEDENCIA
									) {
							do {
								fila.offer(pilha.pop());
								precedencia_topo_pilha = checarPrecedencia(pilha.peek());
							}while(precedencia_operacao_lida == MENOR_PRECEDENCIA
								&&
								precedencia_topo_pilha == MAIOR_PRECEDENCIA);
							//pilha.push(token);
							fila.offer(pilha.pop());
							pilha.push(token);
						}else {
							fila.offer(pilha.pop());
							pilha.push(token);
						}
					}
				}catch(EmptyStackException e) {
					pilha.push(token);
				}
				
			}else { fila.offer(token);  }	
					
			lista_infix.remove(0);
		}
		
		System.out.println(pilha);
		System.out.println(fila);
		
		while(!pilha.isEmpty()) {
			fila.offer(pilha.pop());
		}
		System.out.println(fila);
		
		System.out.println("Resultado Final:"
						   + "\n" + this.calcular(fila)
						);
	}
	
	private boolean checarNumero(String valor) {
		switch(valor) {
		case "/":
		case "*":
		case "+":
		case "-": return false;
		default: return true;
		}
	}
	
	@SuppressWarnings("unused")
	private boolean checarSoma(String valor) {
		return valor.equals("+") ? true : false;
	}
	
	@SuppressWarnings("unused")
	private boolean checarSubtracao(String valor) {
		return valor.equals("-") ? true : false;
	}
	
	private boolean checarPrecedencia(String valor) {
		switch(valor) {
		case "/":
		case "*": return MAIOR_PRECEDENCIA;
		default: return MENOR_PRECEDENCIA;
		}
	}
	
	private double calcular(ArrayDeque<String> fila_final) {
		Stack<Double> pilha = new Stack<Double>();
		
		while(!fila_final.isEmpty()) {
			String token = fila_final.poll();
			
			if(
				this.checarNumero(token)
				) {
				pilha.push(Double.valueOf(token));
			}else {
				double operando_1 = pilha.pop();
				double operando_2 = pilha.pop();
				pilha.push(
						new Operacao(operando_2, operando_1, token)
							.getResultado()
						);
			}
			
			System.out.println("PILHA:");
			System.out.println(pilha);
		}
		
		return pilha.pop();
		
	}

	private class Operacao{
		private double operando_1;
		private double operando_2;
		private String operador;
		private double resultado;
		
		public Operacao(double operando_1, 
						double operando_2,
						String operador
				) {
			this.operador = operador;
			this.operando_1 = operando_1;
			this.operando_2 = operando_2;
			this.resultado = 0;
			this.calcular();
		}
		
		public void calcular() {
			switch(operador) {
				case "*": 	resultado =
						operando_1 * operando_2;
	   					break;
	   					
				case "/": 	resultado =
						operando_1 / operando_2;
	   					break;
	   					
			   case "-": 	resultado =
								operando_1 - operando_2;
			   			break;
			   			
			   default: 	resultado =
								operando_1 + operando_2;
						break;
			}
		}
		public double getResultado() {
			return resultado;
		}
	}
}
