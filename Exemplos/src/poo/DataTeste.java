package poo;

public class DataTeste {
	public static void main(String[] args) {
		Data data_1 = new Data();
		data_1.imprimirTela();
		
		Data data_2 = new Data((byte) (30+1), 
						(byte) (11+1), (short) (1995-1) 
					);
		data_2.imprimirTela();
		
		Data data_3 = new Data((byte)5, (byte)9, (short)2077);
		data_3.imprimirTela();
	}
}
