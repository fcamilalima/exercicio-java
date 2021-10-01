package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Desafio {
	public static void main(String[] args) {
		double somatorio = 0.0;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite a quantidade de notas do Aluno: ");
		int numeroDeNotas = entrada.nextInt();

		double[] notas = new double[numeroDeNotas];

		for (int i = 0; i < numeroDeNotas; i++) {
			System.out.printf("Digite a nota %d: %n", i+1);
			notas[i] = entrada.nextDouble();
		}

		for (double nota : notas) {
			somatorio += nota;
		}

		System.out.printf("A média do aluno é %.1f.%n", somatorio/notas.length);
		System.out.println("Notas do Aluno: " + Arrays.toString(notas));

		entrada.close();
	}
}
