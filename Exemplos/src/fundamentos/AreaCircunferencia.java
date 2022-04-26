package fundamentos;

import java.lang.Math;

public class AreaCircunferencia {
	public static void main(String[] args) {
		double raio = 3.4;
		final double PI = 3.14159265;
		double area = PI * Math.pow(raio, 2);
		
		System.out.println(area);
	}
}
