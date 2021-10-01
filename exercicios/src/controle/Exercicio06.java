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
			System.out.println("Voc� digitou: " + valor + ".");
			if (valorAleatorio == valor) {
				System.out.println("Voc� acertou o n�mero sorteado: " + valorAleatorio + "!");
			} else {
				System.out.println("Voc� errou o n�mero sorteado: " + valorAleatorio + "!");
				System.out.println("Possui ainda " + (10 - contador) + " tentativas!");
			}
		} while (!(valorAleatorio == valor || contador == 10));
		System.out.println("N�o v� embora! :'(\nJogo encerrado! ");
		entrada.close();
	}
}
