package fundamentos;

public class ConversaoStringInteiro {
	public static void main(String[] args) {
		String string_1 = "314159265";
		String string_2 = "314159265";
		
		// 314159265 + 314159265 = 628318530
		System.out.println(
				Integer.parseInt(string_2)
				+
				Integer.parseInt(string_1)
				);
	}
}
