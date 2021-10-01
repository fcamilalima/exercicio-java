package fundamentos.operadores;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a base de um triângulo:");
		double base = entrada.nextDouble();

		System.out.println("Digite a altura de um triângulo:");
		double altura = entrada.nextDouble();
		
		double area = (base * altura)/2;
		System.out.println("A área do triângulo é " + base + ".");
		
	}
}
