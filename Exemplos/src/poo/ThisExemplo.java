package poo;

public class ThisExemplo {
	private int atributo_int;
	private double atributo_double;
	private String atributo_string;
	
	public ThisExemplo() {
		this(1, 1.0, "1");
	}
	
	public ThisExemplo(int atributo_int,
				double atributo_double,
				String atributo_string
			){
		this.atributo_int = atributo_int;
		this.atributo_double = atributo_double;
		this.atributo_string = atributo_string;
	}
	
	public String getAtributosFormatoString() {
		return new String(
					atributo_string + " - " +
					atributo_double + " - " +
					atributo_int + "\n"
				);
	}
}
