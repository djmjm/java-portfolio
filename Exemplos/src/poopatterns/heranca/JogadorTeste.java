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
		System.out.println();
		
		Jogador inimigo = new Jogador(1, -6);
		inimigo.atacar(jogador);
		inimigo.atacar(jogador);
		System.out.println(jogador);
		
		inimigo.andar(Direcao.BAIXO);
		inimigo.atacar(jogador);
		inimigo.atacar(jogador);
		System.out.println(jogador);
		System.out.println();
		
		for(int i = 0; i < 99; i++) {
			inimigo.atacar(jogador);
		}
		
		System.out.println(jogador);
		System.out.println();
		
		Jogador heroi = new Heroi(1,1);
		Jogador monstro = new Monstro(-1,-1);
		
		System.out.println(heroi);
		System.out.println(monstro);
		System.out.println();
		
		heroi.atacar(monstro);
		monstro.atacar(heroi);
		
		System.out.println(heroi);
		System.out.println(monstro);
		System.out.println();
		
		monstro.andar(Direcao.BAIXO);
		heroi.atacar(monstro);
		monstro.atacar(heroi);
		
		System.out.println(heroi);
		System.out.println(monstro);
		System.out.println();
		
		System.out.println("INICIO BATALHA!!!");
		System.out.println(heroi);
		System.out.println("==> CONTRA <==");
		System.out.println(monstro);
		while(true) {
			if(!heroi.estaVivo()) {
				System.out.println("Herói morreu!");
				System.out.println();
				break;
			}
			if(!monstro.estaVivo()) {
				System.out.println("Monstro morreu!");
				System.out.println();
				break;
			}
			heroi.atacar(monstro);
			monstro.atacar(heroi);
		}
		
		System.out.println(heroi);
		System.out.println(monstro);
		System.out.println();
	}
}
