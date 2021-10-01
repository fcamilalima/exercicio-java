package fundamentos;

import java.util.Locale;
import java.util.Scanner;

public class ProgramaPerimetro {
	public static void main(String[] args) {
		final double RAIO;
		try (Scanner entrada = new Scanner(System.in)) {
			System.out.print("Digite o raio: ");
			
			// cria��o de um novo objeto Locale.
			final var localeAmericano = new Locale("en", "US");
			
			// nextDouble usar� o Locale criado gra�as ao m�todo  userLocale.   
			RAIO = entrada.useLocale(localeAmericano).nextDouble();
			entrada.close();
		}
		System.out.format("Per�metro = %.2f%n", 2 * Math.PI * RAIO);
		
		/*
		 * Sa�da: 
		 * Digite o raio: 1.5 
		 * Per�metro = 9,42
		 */
	}
}
