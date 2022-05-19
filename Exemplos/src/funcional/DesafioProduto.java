package funcional;

import java.util.function.Function;
import java.util.function.UnaryOperator;

import poopatterns.composicao.desafio.Produto;

public class DesafioProduto {
	
	private static UnaryOperator<Double> desconto10 = 
			x -> x - (x * 0.10);
	private static UnaryOperator<Double> desconto15 = 
			x -> x - (x * 0.15);
	private static UnaryOperator<Double> desconto20 = 
			x -> x - (x * 0.20);
			
	private static UnaryOperator<Double> arredondar =
			x -> (double) ( (int)(x * 100) ) / 100;
	
	private static Function<Double, Double> impostoMunicipal = 
			x -> x >= 2500 ? x - (x * 0.085)
				   : x
				   ;
	
	private static Function<Double, Double> frete =
			x -> x >= 3000 ? 100.0 : 50.0;
			
	private static Function<Double, String> formatar =
			x -> "R$".concat(x.toString()).replace('.', ',');
				
	public static void main(String[] args) {
		Produto generico = new Produto();
		System.out.println(
					calcularLucroDescontoProgressivo(generico)
				);
		
		Produto coreI3 = new Produto(
				"Processador Intel Core i3-10105f",
				495.00
				);
		
		Produto rtx3060 = new Produto(
				"Nvidia Geforce RTX 3060 12GBs",
				5642.91
				);
		
		System.out.println(
					calcularLucroDescontoProgressivo(rtx3060)
				);
		System.out.println(
				calcularLucroDescontoProgressivo(coreI3)
			);
		
		
	}
	
	public static String calcularLucroDescontoProgressivo(Produto produto) {
		String resultado = new String("");
		
		resultado += calcularLucroLiquido(produto).concat("\n");
		resultado += calcularLucroLiquido(produto, Desconto.dez).concat("\n");
		resultado += calcularLucroLiquido(produto, Desconto.quinze).concat("\n");
		resultado += calcularLucroLiquido(produto, Desconto.vinte).concat("\n");
		
		return resultado;
	}
	
	public static String calcularLucroLiquido(Produto produto) {
		return calcularLucroLiquido(produto, Desconto.nenhum);
	}
	
	public static String calcularLucroLiquido(Produto produto, Desconto desconto) {
		final String nome = produto.getNome().toUpperCase();
		double lucro = produto.getPreco();
		
		switch(desconto) {
			case nenhum: break;
			case dez:    lucro = desconto10.apply(lucro); break;
			case quinze: lucro = desconto15.apply(lucro); break;
			case vinte:  lucro = desconto20.apply(lucro); break;
		}
		
		lucro = impostoMunicipal.apply(lucro);
		lucro -= frete.apply(lucro);
		lucro = Math.max(0, lucro);
		lucro = arredondar.apply(lucro);
		
		return nome + " - " + formatar.apply(lucro);
	}
}
