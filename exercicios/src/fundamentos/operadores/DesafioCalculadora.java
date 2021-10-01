package fundamentos.operadores;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class DesafioCalculadora {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o número: ");
		double num1 = entrada.nextDouble();
		
		System.out.println("Informe o número: ");
		double num2 = entrada.nextDouble();
		
		System.out.println("Informe a operacão: ");
		String op = entrada.next();
		
		double resultado = "+".equals(op) ? num1 + num2:0;
		resultado = "-".equals(op) ? num1 - num2:0;
		resultado = "-".equals(op) ? num1 - num2:0;
		resultado = "*".equals(op) ? num1 * num2:0;
		resultado = "/".equals(op) ? num1 / num2:0;
		resultado = "%".equals(op) ? num1 % num2:0;
		
		System.out.printf("%.2f %s %.2f = %.2f", num1, op, num2, resultado);
		
		entrada.close();
		
		
		/*
		 * String valor1 = JOptionPane.showInputDialog( "Digite o primeiro número:");
		 * double valorDouble1 = Double.parseDouble(valor1);
		 * 
		 * String valor2 = JOptionPane.showInputDialog( "Digite o segundo número:");
		 * double valorDouble2 = Double.parseDouble(valor2);
		 * 
		 * String operacao = JOptionPane.showInputDialog(
		 * "Digite a operação desejada:");
		 * 
		 * boolean soma = operacao.equals("+") ; boolean subtracao =
		 * operacao.equals("-"); boolean multiplicacao = operacao.equals("*"); boolean
		 * divisao = operacao.equals("/");
		 * 
		 * double resultado = soma? valorDouble1 + valorDouble2 : (subtracao ?
		 * valorDouble1 - valorDouble2 : (multiplicacao ? valorDouble1 * valorDouble2 :
		 * (divisao ? valorDouble1 / valorDouble2 : 0.0)));
		 * 
		 * JOptionPane.showMessageDialog(null, valor1 + " "+ operacao + " " + valor2 +
		 * " = " + resultado + ".", "Calculadora", JOptionPane.INFORMATION_MESSAGE,
		 * null);
		 */
		
	}
}
