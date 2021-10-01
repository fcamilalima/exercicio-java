package controle;

import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int contador = 0, valor = 0, valorAleatorio = 0;

		do {
			System.out.println("Digite um valor entre 0 e 100: ");
			valor = entrada.nextInt();
			if (!(valor >= 0 && valor <= 100)) {
				System.out.println("Digite um valor entre 0 e 100 CORRETAMENTE: ");
				valor = entrada.nextInt();
			}
			++contador;
			valorAleatorio = (int) Math.floor(Math.random() * (100 - 0));
			System.out.println("Você digitou: " + valor + ".");
			if (valorAleatorio == valor) {
				System.out.println("Você acertou o número sorteado: " + valorAleatorio + "!");
			} else {
				System.out.println("Você errou o número sorteado: " + valorAleatorio + "!");
				System.out.println("Possui ainda " + (10 - contador) + " tentativas!");
			}
		} while (!(valorAleatorio == valor || contador == 10));
		System.out.println("Não vá embora! :'(\nJogo encerrado! ");
		entrada.close();
	}
}
