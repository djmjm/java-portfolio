package streamapi;

import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter1 {
	
	public static Posicao posicionar() {
		return new Posicao();
	}
	
	public static Movimento executarMovimento() {
		return new Movimento();
	}
	
	public static Posicao calcularPosicaoFinal() {
		var posicao = new Posicao();
		var movimentoExecutado = new Movimento();
		
		var passosX	= movimentoExecutado.getPassos().stream().
						filter(Funcoes.eixoX).
						map(Funcoes.eixoXValor).
						iterator();
		var passosY = movimentoExecutado.getPassos().stream().
						filter(Funcoes.eixoY).
						map(Funcoes.eixoYValor).
						iterator();
		
		boolean andar = passosX.hasNext() || passosY.hasNext();
		
		while(andar) {
			if(passosX.hasNext()) {
				posicao.x += passosX.next();
			}else if(passosY.hasNext()) {
				posicao.y += passosY.next();
			}else { andar = false;}
		}
		
		
		return posicao;
	}
	
	public static void main(String[] args) {
		System.out.println(
					posicionar()
				);
		
		System.out.println();
		System.out.println(
					executarMovimento()
				);
		
		System.out.println();
		System.out.println(calcularPosicaoFinal());
	}
}

class Funcoes{
	private Funcoes() {};
	public static Predicate<Direcao> eixoX = dir -> dir == 
				Direcao.leste
				||
				dir == Direcao.oeste;

	public static Predicate<Direcao> eixoY = dir -> dir == 
				Direcao.norte
				||
				dir == Direcao.sul;
	
	public static Predicate<Direcao> isLeste = 
				dir -> dir == Direcao.leste;
	public static Predicate<Direcao> isSul = 
				dir -> dir == Direcao.sul;
	
	public static Function<Direcao, Integer> eixoXValor = 
				x -> isLeste.test(x) ? -1 : 1;
	
	public static Function<Direcao, Integer> eixoYValor = 
				y -> isSul.test(y) ? -1 : 1;
}

