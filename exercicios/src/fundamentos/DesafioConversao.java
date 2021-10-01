package fundamentos;

import java.util.Locale;
import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		
		Locale.setDefault(new Locale("en", "US"));
		
		/*
		 * System.out.println(Locale.getDefault(Locale.Category.DISPLAY));
		 * System.out.println(Locale.getDefault(Locale.Category.FORMAT));
		 */
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o primeiro número: ");
		String valor1 = teclado.nextLine();

		System.out.println("Digite o segundo número: ");
		String valor2 = teclado.nextLine();

		System.out.println("Digite o terceiro número: : ");
		String valor3 = teclado.nextLine();
		
		String valor1_1 = valor1.replace(",", ".");
		String valor2_1 = valor2.replace(",", ".");
		String valor3_1 = valor3.replace(",", ".");
		
		/*
		 * System.out.printf("valor1 = %s%nvalor2 = %s%nvalor3 = %s%n", valor1, valor2,
		 * valor3);
		 */
		
		String valor1_2 = valor1.replace(".", "");
		String valor2_2 = valor2.replace(".", "");
		String valor3_2 = valor3.replace(".", "");
		
		Double salario1 = Double.parseDouble(valor1_2);
		Double salario2 = Double.parseDouble(valor2_2);
		Double salario3 = Double.parseDouble(valor3_2);
		
		Double media = (salario1 + salario2 + salario3)/3;
		
		System.out.printf("A média dos três salários é R$ %.2f.", media);
		teclado.close();
	}
}
