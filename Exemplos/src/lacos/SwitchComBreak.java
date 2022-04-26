package lacos;

import java.util.Scanner;

public class SwitchComBreak {
	private static final int STRING = 1;
	private static final int INTEGER = 2;
	private static final int DOUBLE = 3;
	private static final int BOOLEAN = 4;
	
	private static Boolean checarBooleano(String valor) {
		return valor.equalsIgnoreCase("true")
				|| valor.equalsIgnoreCase("false");
	}
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		String resposta = leitor.next();
		int tipo = -1;
		try {
			java.lang.Integer.valueOf(
							resposta
						);
			tipo = INTEGER;
		}catch(NumberFormatException e) {
			try {
				java.lang.Double.valueOf(
						resposta
					);
				tipo = DOUBLE;
			}catch(NumberFormatException ed) {
					if( SwitchComBreak.checarBooleano(
							resposta
							)
					) {
						tipo = BOOLEAN;
					}else {
						tipo = STRING;
					}
			}
		}
		
		leitor.close();
		
		switch(tipo) {
			case STRING:	
				System.out.println("STRING");break;
			case DOUBLE:	
				System.out.println("DOUBLE");break;
			case INTEGER:	
				System.out.println("INTEGER");break;
			case BOOLEAN:	
				System.out.println("BOOLEAN");break;
			default:
				System.out.println("INDEF");break;
		}
	}
}