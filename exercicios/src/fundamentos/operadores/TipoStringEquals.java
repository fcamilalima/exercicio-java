package fundamentos.operadores;

import java.util.Scanner;

public class TipoStringEquals {
	public static void main(String[] args) {
		System.out.println("2" == "2"); // Resposta: true
		
		String s = new String("2");  
		System.out.println("2" == s);  // Resposta: false
		System.out.println("2".equals(s));  // Resposta: true
		
		Scanner entrada = new Scanner(System.in);
		String s2 = entrada.next(); // Remove espaços em branco.
        // nextLine() não remove os espaços em branco.		
		System.out.println("2" == s2.trim());
		System.out.println("2".equals(s2.trim()));
		
		entrada.close();
	}
}
