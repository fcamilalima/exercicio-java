package fundamentos;

/**
 * @author Camila Lima
 * @aula Aula 26 - Notação Ponto.
 * @date Data: 20/08/2021.
 *
 */
public class NotacaoPonto {
	public static void main(String[] args) {
		
		String s = "Bom dia X"; // Tipos que não são primitivos oferecem a 
		s.replace("X", "Senhora"); // opção do uso do operador ponto para  
		s = s.toUpperCase(); // acessar métodos.
        
		s = s.concat("!!!");
		
		System.out.println(s);
		
		String x = "Leo".toUpperCase();
		System.out.println(x);
		
		String y = "Bom dia X"
				.replace("X", "Gui")
				.toUpperCase()
				.concat("!!!");
		System.out.println(y);
		
		// Tipos primitivos não tem o operador ".".
		int a = 3;
		System.out.println(a);
	}
}
