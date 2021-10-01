package fundamentos;

/**
 * @author Camila Lima
 * @aula Aula 26 - Nota��o Ponto.
 * @date Data: 20/08/2021.
 *
 */
public class NotacaoPonto {
	public static void main(String[] args) {
		
		String s = "Bom dia X"; // Tipos que n�o s�o primitivos oferecem a 
		s.replace("X", "Senhora"); // op��o do uso do operador ponto para  
		s = s.toUpperCase(); // acessar m�todos.
        
		s = s.concat("!!!");
		
		System.out.println(s);
		
		String x = "Leo".toUpperCase();
		System.out.println(x);
		
		String y = "Bom dia X"
				.replace("X", "Gui")
				.toUpperCase()
				.concat("!!!");
		System.out.println(y);
		
		// Tipos primitivos n�o tem o operador ".".
		int a = 3;
		System.out.println(a);
	}
}
