package fundamentos.operadores;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.printf("Equação do segundo grau.%nDigite os "
				+ "valores de a, b, c.%n");
		System.out.printf("Digite o valor de a: ");
		double a = entrada.nextDouble();
		
		System.out.printf("Digite o valor de b: ");
		double b = entrada.nextDouble();
		
		System.out.printf("Digite o valor de c: ");
		double c = entrada.nextDouble();
		
		double delta = Math.pow(b, 2) - 4 * a * c;
		
		double xLinha = (-b + Math.sqrt(delta))/(2 * a);
		double x2Linha = (-b - Math.sqrt(delta))/(2 * a);
		
		System.out.printf("As raízes da equação são: %.1f e %.1f", 
			xLinha, x2Linha);
		
	}
}
