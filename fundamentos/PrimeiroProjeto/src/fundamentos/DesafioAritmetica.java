package fundamentos;

/*
 * (
 * 
 * [
 * ( [ 6 * (3 + 2) ] ** 2 ) / (3 * 2)
 * -
 * ( [ (1 - 5) * (2 - 7) ] ** 2 ) / 2
 * ] ** 3
 * 
 * ) / 10 ** 3
 * 
 * RESULTADO - "125"
 */

public class DesafioAritmetica {
	public static void main(String[] args) {
		
		final int a = 3 + 2;
		final int b = 6;
		final int c = 2;
		final int d = 3 * 2;
		// final int e = 1; pulou
		final int f = 1 - 5;
		final int g = 2 - 7;
		final int h = 2;
		final int i = 2;
		final int j = 3;
		final int l = 10;
		final int m = 3;
		
		int resultado = (int) Math.pow(b * a, c) / d;
		resultado -= (int) Math.pow(f * g / i, h);
		resultado = (int) Math.pow(resultado, j);
		resultado = resultado / (int) Math.pow(l, m);
		
		System.out.println(resultado);
	}
}

/*
*
* (
* 
* [
* ( [ b * a ] ** c ) / d
* -
* ( [ f * g ] ** h ) / i
* ] ** j
* 
* ) / l ** m
* 
*/