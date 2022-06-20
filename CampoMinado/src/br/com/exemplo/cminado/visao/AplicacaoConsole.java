package br.com.exemplo.cminado.visao;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

import br.com.exemplo.cminado.excecao.ExplosaoException;
import br.com.exemplo.cminado.excecao.SairException;
import br.com.exemplo.cminado.modelo.Tabuleiro;

public class AplicacaoConsole {
	private Tabuleiro tabuleiro;
	private Scanner entrada = new Scanner(System.in);
	
	public AplicacaoConsole( Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
		
		executarJogo();
	}
	
	private void executarJogo() {
		try {
			boolean continuar = true;
				cicloJogo();
				while(continuar) {
					System.out.println(" Jogar novamente? (S/n) ");
				
				String resposta = entrada.nextLine();
				if(resposta.equalsIgnoreCase("n")) {
					continuar = false;
				}else {
					tabuleiro.reiniciar();
					cicloJogo();
				}
			}
		}
		catch( SairException e ){
			System.out.println("Saindo ... Até a próxima!");
		}
		finally {
			entrada.close();
		}
	}
	
	private void cicloJogo() {
		try {
			while( !tabuleiro.objetivoAlcancado() ) {
				System.out.println(tabuleiro);
				String digitado = capturarValorDigitado(
									"Digite (x, y): "
								  );
				Iterator<Integer> xy = Arrays.stream(
							digitado.split(",")
						).map( e -> Integer.parseInt(
									e.trim()
								)
							).iterator()
						;
				digitado = capturarValorDigitado(
							"1 - Abrir | 2 - (des)marcar: "
						  );
				if(digitado.equals("1")) {
					tabuleiro.abrir(xy.next(), xy.next());
				}
				else if(digitado.equals("2")){
					tabuleiro.marcar(xy.next(), xy.next());
				}
				
			}
			System.out.println("Você ganhou !!!");
		}
		catch(ExplosaoException e) {
			System.out.println("Você perdeu ...");
		}
	}
	
	private String capturarValorDigitado(String texto) {
		System.out.println(texto);
		String digitado = entrada.nextLine();
		
		if( digitado.equalsIgnoreCase("sair") ) {
			throw new SairException();
		}
		
		return digitado;
	}
	
}
