package lacos;

/** retirando warnings (apenas exemplo para estudo) **/
@SuppressWarnings({ "all", "unused"})

public class IfElseIfExemplo {
	public static void main(String[] args) {
		if(false);else if(false);else if(false);else if(false); // dead code;
		else if(false);else if(false);else if(false);else if(false); // apenas exemplo ...
		else if(true) System.out.println("Hello IfElseIf");
	}
}
