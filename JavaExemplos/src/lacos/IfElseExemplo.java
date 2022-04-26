package lacos;

public class IfElseExemplo {
	public static void main(String[] args) {
		boolean bool = false;
		if(true && bool) {
			if(false || bool) {
				System.out.println(1);
			}else{
				System.out.println(2);
			}
		}else{
			System.out.println(3);
		}
			
	}
}
