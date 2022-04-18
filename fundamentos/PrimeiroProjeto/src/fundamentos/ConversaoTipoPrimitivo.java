package fundamentos;

public class ConversaoTipoPrimitivo {
	public static void main(String[] args) {
		int int_1 = 999;
		byte byte_1 = (byte) int_1; // cast overflow
		System.out.println(byte_1);
	}
}
