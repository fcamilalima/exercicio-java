package fundamentos;

public class PrimitivoVsObjeto {
	public static void main(String[] args) {
		String s = "texto";
		s.toUpperCase();
		
		// Wrappers -> vers�o Objeto dos Tipos Primitivos.
		// Tudo em Java � Objeto menos os Tipos Primitivos.		
		int a = 123;
		System.out.println(a);
	}
}
