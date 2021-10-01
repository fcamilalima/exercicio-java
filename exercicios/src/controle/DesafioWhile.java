package controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int quantidadeDeNotas = 0;

		double notas = 0.0, total = 0.0;

		while (notas != -1) {
			System.out.println("Digite uma nota válida: ");
			notas = entrada.nextDouble();
			if(notas == -1) {
				break;
			} else if(notas>=0 && notas<=10) {				
				total += notas;
				++quantidadeDeNotas;
			}
			else {		
				System.out.println("Nota inválida!");
				continue;
			}
		}

		double media = total / quantidadeDeNotas;
		System.out.printf("A média das notas foram: %.2f.", media);
		entrada.close();
	}
}


