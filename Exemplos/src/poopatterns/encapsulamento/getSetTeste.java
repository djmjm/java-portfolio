package poopatterns.encapsulamento;

public class getSetTeste {
	public static void main(String[] args) {
		Computador pc = new Computador();
		
		System.out.println(pc.getPlacaMae());
		System.out.println(pc.getProcessador());
		System.out.println(pc.getMemoria());
		System.out.println();
		
		pc.setPlacaMae("Gigabyte".toUpperCase());
		pc.setProcessador("AMD");
		
		System.out.println(pc.getPlacaMae());
		System.out.println(pc.getProcessador());
		System.out.println(pc.getMemoria());
		System.out.println();
		
		pc.setMemoria("CORSAIR");
		
		System.out.println(pc.getPlacaMae());
		System.out.println(pc.getProcessador());
		System.out.println(pc.getMemoria());
		System.out.println();
	}
}
