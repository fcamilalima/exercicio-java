package fundamentos;

import java.util.Locale;
import java.util.Scanner;

public class ProgramaPerimetro {
	public static void main(String[] args) {
		final double RAIO;
		try (Scanner entrada = new Scanner(System.in)) {
			System.out.print("Digite o raio: ");
			
			// criação de um novo objeto Locale.
			final var localeAmericano = new Locale("en", "US");
			
			// nextDouble usará o Locale criado graças ao método  userLocale.   
			RAIO = entrada.useLocale(localeAmericano).nextDouble();
			entrada.close();
		}
		System.out.format("Perímetro = %.2f%n", 2 * Math.PI * RAIO);
		
		/*
		 * Saída: 
		 * Digite o raio: 1.5 
		 * Perímetro = 9,42
		 */
	}
}
