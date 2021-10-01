package classe;

public class ValorNulo {
	public static void main(String[] args) {
		String s1 = ""; // Vari�veis locais sempre devem ser inicializadas.
		System.out.println(s1.concat("!!!"));

		Data d1 = Math.random() > 0.5 ? new Data() : null;

		if (d1 != null) {
			d1.mes = 3;
			System.out.println(d1.obterDataFormatada());
		}

		String s2 = Math.random() > 0.5 ? "Opa" : null;
		// Erro de NullPointerException - erro de runtime.
		// Erro que acontece em tempo de execu��o e o compilador (Eclipse) n�o
		// informa este erro durante a compila��o. Null n�o aponta para nenhum
		// local de mem�ria.

		// N�o se consegue acessar atributos e comportamentos de uma
		// vari�vel (objeto) nula.
		if (s2 != null) {
			System.out.println(s2.concat("???"));
		}
	}
}
