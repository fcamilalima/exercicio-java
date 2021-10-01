package controle;

import java.util.Scanner;

public class WhileIndeterminado {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String valor = "";
		
		while(!valor.equalsIgnoreCase("sair")) {
			System.out.println("Você diz: ");
			valor = entrada.nextLine();
		}		
		
		entrada.close();
		/*
		 * System.out.println("Digite algo: "); Scanner entrada = new
		 * Scanner(System.in); String s = entrada.nextLine();
		 * System.out.println("Você digitou: " + s);
		 * 
		 * while(!s.equalsIgnoreCase("sair")) { System.out.println("Digite algo: "); s =
		 * entrada.nextLine(); System.out.println("Você digitou: " + s); }
		 * System.out.println("Saída efetuada com sucesso!");
		 * 
		 * entrada.close();
		 */
	}
}
