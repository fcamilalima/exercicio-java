package controle;

public class Continue {
	public static void main(String[] args) {
		// Não use break e continue!
		// São estruturas que desviam o fluxo do código-fonte;
		
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 1) {
				continue;
			}
			System.out.println(i);
		}
		
		for (int i = 0; i <= 10; i++) {
			if (i == 5) continue;
			System.out.println(i);
		}
	}
}
