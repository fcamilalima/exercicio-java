package controle;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um n�mero: ");
		int i = entrada.nextInt();
		if (i >= 0 && i <= 10) {
			if(i % 2 == 0) {
				System.out.println("Este n�mero est� entre 0 e 10 e � um n�mero par.");
			}else {
				System.out.println("Este n�mero est� entre 0 e 10 e � um n�mero �mpar.");
			}
		}else {
			System.out.println("Este n�mero n�o est� entre 0 e 10.");			
		}
		entrada.close();
	}
}
