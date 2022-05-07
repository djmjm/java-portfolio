package poopatterns.heranca;

public class Jogador {
	
	private Posicao posicao = new Posicao();
	private int vida = 100;
	
	public Jogador() {}
	public Jogador(int x, int y) {
		posicao.x = x;
		posicao.y = y;
	}
	
	public void atacar(Jogador inimigo) {
		int distanciaX = Math.abs( inimigo.posicao.x - posicao.x );
		int distanciaY = Math.abs( inimigo.posicao.y - posicao.y );
		
		boolean questao1 = distanciaX == 1;
		boolean questao2 = distanciaY == 1;
		boolean resposta = questao1 || questao2;
		
		if(resposta) {
			inimigo.vida -= 10;
			inimigo.vida = Math.max(inimigo.vida, 0);
		}
		
	}
	
	public void andar(Direcao direcao) {
		switch(direcao) {
			case DIREITA: posicao.setPosicao(
					posicao.x + 1, 
					posicao.y);
			break;
			
			case ESQUERDA: posicao.setPosicao(
					posicao.x - 1, 
					posicao.y);
			break;
			
			case CIMA: posicao.setPosicao(
					posicao.x, 
					posicao.y - 1);
			break;
			
			case BAIXO: posicao.setPosicao(
					posicao.x, 
					posicao.y + 1);
			break;
		}
	}
	
	public Posicao getPosicao() {
		return posicao;
	}
	
	@Override
	public String toString() {
		return "Posição atual - " +
				"(" + posicao.x + "," +
				"" + posicao.y + ")" +
				" | " + "Vida - " + vida + "%"
				;
	}
	
	private class Posicao{
		private int x;
		private int y;
		
		Posicao() {
			x = 0;
			y = 0;
		}
		
		private void setPosicao(int x, int y) {
			this.x = x;
			this.y = y;
		}
		
	}
}
