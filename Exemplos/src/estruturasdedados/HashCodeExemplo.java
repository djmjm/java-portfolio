package estruturasdedados;

public class HashCodeExemplo {
	public static void main(String[] args) {
		ClubesFutebol clube1 = new ClubesFutebol();
		ClubesFutebol clube2 = new ClubesFutebol();
		ClubesFutebol clube3 = new ClubesFutebol("Grêmio", "São Paulo", 1903);
		ClubesFutebol clube4 = new ClubesFutebol("Grêmio", "Porto Alegre", 2022);
		ClubesFutebol clube5 = new ClubesFutebol("Brasil de Pelotas", "Porto Alegre", 1903);
		
		System.out.println(clube1.equals(clube2));
		System.out.println(clube1.equals(clube3));
		System.out.println(clube1.equals(clube4));
		System.out.println(clube1.equals(clube5));
	}
}
