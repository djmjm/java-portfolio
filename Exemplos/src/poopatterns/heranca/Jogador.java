package poopatterns.heranca;

public class Jogador {
	
	private Posicao posicao = new Posicao();;
	
	public void andar(Direcao direcao) {
		var posicaoAtual = posicao.getPosicao();
		
		switch(direcao) {
			case DIREITA: posicao.setPosicao(
					posicaoAtual.x + 1, 
					posicaoAtual.y);
			break;
			
			case ESQUERDA: posicao.setPosicao(
					posicaoAtual.x - 1, 
					posicaoAtual.y);
			break;
			
			case CIMA: posicao.setPosicao(
					posicaoAtual.x, 
					posicaoAtual.y - 1);
			break;
			
			case BAIXO: posicao.setPosicao(
					posicaoAtual.x, 
					posicaoAtual.y + 1);
			break;
		}
	}
	
	@Override
	public String toString() {
		var posicaoAtual = posicao.getPosicao();
		return "(" + posicaoAtual.x + "," +
				" " + posicaoAtual.y + ")" 
				;
	}
	
	private class Posicao{
		private int x;
		private int y;
		
		Posicao() {
			x = 0;
			y = 0;
		}
		
		public void setPosicao(int x, int y) {
			this.x = x;
			this.y = y;
		}
		
		public Posicao getPosicao() {
			return this;
		}
	}
}
