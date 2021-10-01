package controle;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um número: ");
		int numero = entrada.nextInt();
		int contador = 0;

		for (int i = 1; i <= numero; i++) {
			if (numero % i == 0) {
				++contador;
			}
		}
		
		if (contador == 2) {
			System.out.println("O número "+ numero + "é um número primo.");
		} else {
			System.out.println("O número "+ numero + "não é um número primo.");
		}

		entrada.close();
	}
}
