package fundamentos.operadores;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um valor:");
		double valor = entrada.nextDouble();
		
		double valorQuadrado = Math.pow(valor, 2.0);
		double valorCubo = Math.pow(valor, 3.0);
		
		System.out.printf("O valor de %.1f ao quadrado: %.1f.%n"
			+ "O valor de %.1f ao cubo: %.1f.", valor, valorQuadrado, 
			valor, valorCubo);
		
	}
}
