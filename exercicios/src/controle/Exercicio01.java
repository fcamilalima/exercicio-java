package controle;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int i = entrada.nextInt();
		if (i >= 0 && i <= 10) {
			if(i % 2 == 0) {
				System.out.println("Este número está entre 0 e 10 e é um número par.");
			}else {
				System.out.println("Este número está entre 0 e 10 e é um número ímpar.");
			}
		}else {
			System.out.println("Este número não está entre 0 e 10.");			
		}
		entrada.close();
	}
}
