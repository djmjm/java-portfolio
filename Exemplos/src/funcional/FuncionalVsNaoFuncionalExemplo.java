package funcional;

public class FuncionalVsNaoFuncionalExemplo 
		implements InterfaceNaoFuncional
{
	public static InterfaceFuncional funcao = 
					x -> "Funcional".toUpperCase();
	
	public static void main(String[] args) {
		 var self  = FuncionalVsNaoFuncionalExemplo.funcao;
		 System.out.println(self.funcao("x"));
		 System.out.println(InterfaceNaoFuncional.metodo("x"));
	}
}
