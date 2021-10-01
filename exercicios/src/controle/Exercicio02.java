package controle;

import java.util.Calendar;

public class Exercicio02 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		int ano = cal.get(Calendar.YEAR);
		System.out.print("O ano atual é " + ano + ". ");
		if (ano % 4 == 0) {
			System.out.print("Este ano é bissexto.");
		} else {
			System.out.print("Este ano não é bissexto.");
		}
	}
}
