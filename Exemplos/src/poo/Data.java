package poo;

public class Data {
	private byte dia;
	private byte mes;
	private short ano;
	
	public Data() {
		dia = 1;
		mes = 6;
		ano = 1995;
	}
	
	public Data(byte dia, byte mes, short ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public void imprimirTela() {
		System.out.println(
				dia + "/" + mes
				+ "/" + ano
				);
	}
}
