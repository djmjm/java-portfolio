package poopatterns.heranca.interfaces;

import java.util.ArrayList;
import java.util.List;

public class PartidaFutebol {
	public static void main(String[] args) {
		List<JogadorFutebol> time = new ArrayList<JogadorFutebol>();
		
		time.add(new Neuer());
		time.add(new Geromel());
		time.add(new Haaland());
		
		System.out.println("==> ESCALAÇÃO TIME <==");
		for(JogadorFutebol jogador: time) {
			System.out.println(jogador);
		}
		
		System.out.println();
		System.out.println("|| COMEÇO DA PARTIDA ||");
		for(int i = 0; i < 90; i++) {
			var jogadorComBola = time.get(i%3);
			System.out.println("MINUTO - " + (i+1) + " || " +
						jogadorComBola.getNome() + " ->> " +
						jogadorComBola.jogar()
					);
		}
	}
}
