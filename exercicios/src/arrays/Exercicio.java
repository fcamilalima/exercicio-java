package arrays;

import java.util.Arrays;

public class Exercicio {
	public static void main(String[] args) {
		double[] notasAlunoA = new double[3];
		// double notas[] = new double[3]; Tamb�m � aceita essa nota��o.

		System.out.println(Arrays.toString(notasAlunoA));

		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;

		System.out.println(Arrays.toString(notasAlunoA));
		System.out.println(notasAlunoA[0]);
		System.out.println(notasAlunoA[notasAlunoA.length - 1]);
        // System.out.println(notasAlunoA[4]); ERRO!
        // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 
		// Index 4 out of bounds for length 3

		double totalAlunoA = 0.0;
		for (int i = 0; i < notasAlunoA.length; i++) {
			totalAlunoA += notasAlunoA[i];
		}

		System.out.println(totalAlunoA / notasAlunoA.length);

		double totalAlunoB = 0.0;
		double[] notasAlunosB = { 6.9, 8.9, 5.5, 10.0 };
		for (int i = 0; i < notasAlunosB.length; i++) {
			totalAlunoB += notasAlunosB[i];
		}

		System.out.println(totalAlunoB / notasAlunosB.length);
	}
}
