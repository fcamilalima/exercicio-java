package fundamentos;

public class PrimitivoVsObjeto {
	public static void main(String[] args) {
		String s = "texto";
		s.toUpperCase();
		
		// Wrappers -> versão Objeto dos Tipos Primitivos.
		// Tudo em Java é Objeto menos os Tipos Primitivos.		
		int a = 123;
		System.out.println(a);
	}
}
