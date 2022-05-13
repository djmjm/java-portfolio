package funcional;

import java.util.Arrays;
import java.util.List;

public class Foreach {
	public static void main(String[] args) {
		List<String> clubes = Arrays.asList("Grêmio", "Palmeiras", "Inter");
		
		clubes.forEach(clube -> System.out.println(clube.toUpperCase()));
	}
}
