package controle;

public class BreakRotulado {
	public static void main(String[] args) {
		// N�o use break e continue!
		// S�o estruturas de controle que desviam o fluxo do c�digo-fonte.

		externo: for (int i = 0; i < 3; i++) {
			interno: for (int j = 0; j < 3; j++) {
				if (i == 1) {
					break externo;
				}
				System.out.printf("%d %d %n", i, j);
			}
			System.out.println();
		}
		System.out.println("Fim!");
	}
}
