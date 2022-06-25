package padroes.observer;

import java.util.function.UnaryOperator;

public class AniversarioSurpresa {
	public static void main(String[] args) {
		Porteiro porteiro = new Porteiro();
		Namorada namorada = new Namorada();
		UnaryOperator<ObservadorChegadaAniversariante> mae = e -> {
			System.out.println("Sua mãe também está aqui!");
			return e;
		};
		
		porteiro.registrarObservador(namorada);
		
		porteiro.registrarObservador(e -> {
			System.out.println("Sua mãe também está aqui!");
		});
		
		porteiro.monitorar();
		
		
	}
}
