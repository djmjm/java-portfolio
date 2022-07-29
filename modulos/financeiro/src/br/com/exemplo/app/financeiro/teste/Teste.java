package br.com.exemplo.app.financeiro.teste;

import java.util.ServiceLoader;

import br.com.exemplo.app.Calculadora;

public class Teste {
	public static void main(String[] args) {
		
		Calculadora calculadora =
					ServiceLoader.
					load(Calculadora.class).
					findFirst().
					get()
					;
		
		var answer = calculadora.soma(1,2,3,4,5);
		System.out.println(answer);
		
	}
}
