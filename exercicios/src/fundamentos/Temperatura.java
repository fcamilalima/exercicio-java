package fundamentos;

import java.util.Scanner;

public class Temperatura {
	public static void main(String[] args) {
		final double FATOR = 5.0/9.0;
		final double AJUSTE = 32;
		double temperaturaCelsius = 0.0, temperaturaFahreinheit = 0.0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Informe a temperatura em Fahrenheit: ");
		temperaturaFahreinheit = scanner.nextDouble();
		temperaturaCelsius = (temperaturaFahreinheit - AJUSTE) * FATOR;
		
		System.out.println("A temperatura em Fahrenheit: " + 
				temperaturaFahreinheit + "°F.\nTemperatura em Celsius: " + 
				temperaturaCelsius + "°C.");
	}
}
