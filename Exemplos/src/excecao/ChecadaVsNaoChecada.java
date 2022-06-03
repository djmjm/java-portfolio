package excecao;

public class ChecadaVsNaoChecada {
	
	private static void checar() {
		//throw // Descomentar para verificar ;;
				// erro compilação.           ;;
		new Exception();
	}
	
	private static void naoChecar() {
		throw  // Sem erro compilação. ;;
		new RuntimeException();
	}
	
	public static void main(String[] args) {
		try {
			checar(); naoChecar();
		}catch(Exception e){
			System.out.println("Executado com sucesso.");
			System.out.println("Exceção capturada!");
		}
	}
}
