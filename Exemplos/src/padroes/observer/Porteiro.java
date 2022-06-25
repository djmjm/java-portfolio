package padroes.observer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Porteiro {
	private List<ObservadorChegadaAniversariante>
			observadores = new ArrayList<>();
	
	public void registrarObservador(
				ObservadorChegadaAniversariante
				observador
			) {
		observadores.add(observador);
	}
	
	public void monitorar() {
		Scanner entrada = new Scanner(System.in);
		
		String valor = "";
		valor = entrada.nextLine();
		
		while(!valor.equalsIgnoreCase("sair")) {
			System.out.println("Aniversariante chegou?");
			valor = entrada.nextLine();
			
			if(valor.equalsIgnoreCase("sim")) {
				EventoChegadaAniversariante
					evento = 
					new EventoChegadaAniversariante(
								new Date()
							);
				observadores.stream().forEach(
						e -> e.chegou(evento)
						);
				
				valor = "sair";
			}
			else {
				System.out.println("Ainda não chegou ...");
			}
		}
	}
}
