package fundamentos.operadores;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Entre com a temperatura em Fahrenheit: ");
		double temperaturaFahrenheit = entrada.nextDouble();
		
		double temperaturaCelsius = (temperaturaFahrenheit -32)*(5.0/9.0);
		System.out.printf("Temperatura em Fahrenheit: %.1f°F.%n" + 
			"Temperatura em Celsius: %.1f°C.", temperaturaFahrenheit, 
			temperaturaCelsius);		
	}
}
