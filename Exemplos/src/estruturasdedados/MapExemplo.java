package estruturasdedados;

import java.util.HashMap;
import java.util.Map;

public class MapExemplo {
	public static void main(String[] args) {
		Map<Integer, String> mapa = new HashMap<Integer, String>();
		
		for(int i = -5; i <= 5; i++) {
			mapa.put(i, "Anonimo".toLowerCase());
		}
		
		System.out.println(mapa.values());
		System.out.println(mapa.keySet());
		System.out.println(mapa.entrySet());
		
		mapa.put(0, "Douglas"); mapa.put(3, "Douglas");
		System.out.println(mapa.entrySet());
		
	}
}
