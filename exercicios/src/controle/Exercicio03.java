package controle;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite a primeira nota: ");
		double nota1 = entrada.nextDouble();

		System.out.println("Digite a segunda nota: ");
		double nota2 = entrada.nextDouble();

		double media = (nota1 + nota2) / 2;

		if (media >= 7.0 && media<=10) {
			System.out.println("M�dia = " + media + "\nAprovado!");
		} else if (media < 7.0 && media > 4.0) {
			System.out.println("M�dia = " + media + "\nRecupera��o!");
		} else if (media <= 4.0) {
			System.out.println("M�dia = " + media + "\nReprovado!");
		} else if (media > 10) {
			System.out.println("Nota inv�lida!");
		}
		entrada.close();
	}
}
