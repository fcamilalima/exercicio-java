package controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// if(...) sentença; ou {}
		// while (...) sentença; ou {}
		
		// do setença; ou while(...);
		// Atalho Window >> Prefrences >> Java >> Editor >> Templates
		
		Scanner entrada = new Scanner(System.in);

		String texto = "";
		
		do {
			System.out.println("Você precisa falar as palavras mágicas...");
			System.out.println("Quer sair?");
			texto = entrada.nextLine();
		} while (!texto.equalsIgnoreCase("por favor"));

		System.out.println("Obrigado!");
		entrada.close();
	}

}
