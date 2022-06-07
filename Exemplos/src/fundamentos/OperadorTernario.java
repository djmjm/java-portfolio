package fundamentos;

/** retirando warnings (apenas exemplo para estudo) **/
@SuppressWarnings({ "all", "unused"})

public class OperadorTernario {
	public static void main(String[] args) {
		boolean questao_1 = true ? true : false;
		boolean questao_2 = false ? false : true;
		
		System.out.println(questao_1 && questao_2);
	}
}
