package fundamentos.operadores;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a temperatura em °C: ");
		double temperaturaCelsius = entrada.nextDouble();
		double temperaturaFahrenheit = 9.0 / 5.0 * temperaturaCelsius + 32;
		System.out.println("Temperatura em Fahrenheit: " + 
				temperaturaFahrenheit + "°F.\nTemperatura" + 
				" em Celsius:  " + temperaturaCelsius + "°C.");
	}
}
