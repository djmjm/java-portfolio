package poo;

public class NullExemplo {
	public static void main(String[] args) {
		String v_string = null;
		System.out.println(v_string);
		
		if(v_string == null) v_string = new String("not null");
		System.out.println(v_string);
	}
}
