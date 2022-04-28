package poo;

public class Data {
	private byte dia;
	private byte mes;
	private short ano;
	
	private String texto;
	
	public Data() {
		dia = 1;
		mes = 6;
		ano = 1995;
		
		formatarData();
	}
	
	public Data(byte dia, byte mes, short ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		
		formatarData();
	}
	
	private void formatarData() {
		texto = dia + "/" + mes
				+ "/" + ano;
	}
	
	public void imprimirTela() {
		System.out.println(
				texto
				);
	}
}
