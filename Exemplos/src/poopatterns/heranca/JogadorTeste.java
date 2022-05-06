package poopatterns.heranca;

public class JogadorTeste {
	public static void main(String[] args) {
		Jogador jogador = new Jogador();
		
		System.out.println(jogador);
		
		jogador.andar(Direcao.DIREITA);
		jogador.andar(Direcao.DIREITA);
		System.out.println(jogador);
		
		for(int i = 0; i < 5; i++) {
			jogador.andar(Direcao.CIMA);
		}
		System.out.println(jogador);
		
		jogador.andar(Direcao.BAIXO);
		jogador.andar(Direcao.ESQUERDA);
		System.out.println(jogador);
		
	}
}
