package controle;

import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um n�mero para verificar se ele � primo ou n�o: ");
		int numero = entrada.nextInt();
		int contador = 0;
		for (int i = 1; i <= numero; i++) {
			if(numero % i == 0) {
				++contador;				
			}
		}
		switch (contador) {
			case 2:
				System.out.println("O n�mero " + numero + " � primo!");
				break;
			default:
				System.out.println("O n�mero " + numero + " n�o � primo!");
		}
		entrada.close();
	}
}
