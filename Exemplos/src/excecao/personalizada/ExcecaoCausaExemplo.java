package excecao.personalizada;

public class ExcecaoCausaExemplo {
	
	private static void metodo1(String parametro){
		try {
			metodo2(parametro);
		}catch(Exception e) {
			throw new RuntimeException("Não permitido ->> " + e.getCause());
		}
		System.out.println(parametro);
	}
	
	private static void metodo2(String parametro) {
		if(parametro.equals("")) 
			throw new StringIndexOutOfBoundsException();
	}
	
	public static void main(String[] args) {
		try {
			metodo1("");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			metodo1("Tudo OK!!!!");
		}
	}
}
