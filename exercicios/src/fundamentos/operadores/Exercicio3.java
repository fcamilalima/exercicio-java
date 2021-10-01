package fundamentos.operadores;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite sua altura: ");
		double altura = entrada.nextDouble();
		
		System.out.println("Digite seu peso: ");
		double peso = entrada.nextDouble();
		
		double imc = peso / Math.pow(altura, 2);
		
		String estado = imc<18.5 ? "Magreza. Precisa ganhar peso!" : 
			(imc>=18.5 && imc<=24.9)? "Ótimo. Você está no seu peso ideal.": 
			(imc>=24.9 && imc <= 30)? "Está em sobrepeso. Você deve perder "
			+ "alguns quilinhos!": 
			"Você se encontra em obesidade. Toma cuidado com sua alimentação"
			+ ". Procure um nutricionista/médico.";
		
		System.out.printf("O seu IMC é %.1f. %s: ", imc, estado);
		
		
	}
}
