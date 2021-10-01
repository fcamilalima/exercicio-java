package controle;

import java.util.Scanner;

public class Exercicio07 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int valor = 0, acumulador = 0;

		do {
			System.out.println("Digite um número positivo:");
			valor = entrada.nextInt();
			if (valor == -1) {
				break;
			} else {
				acumulador += valor;
				System.out.println("Número digitado: " + valor + "\nVocê acumulou " + acumulador + " no somatório.");
			}
		} while (valor != -1);
		System.out.println("Saindo do programa...");
		System.out.println("3");
		System.out.println("2");
		System.out.println("2");
		System.out.println("1");
		entrada.close();
	}
}
