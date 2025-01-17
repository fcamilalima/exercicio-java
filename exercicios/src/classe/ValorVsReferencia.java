package classe;

public class ValorVsReferencia {
	public static void main(String[] args) {
		double a = 2;
		double b = a; // atribui��o por valor (Tipo primitivo).
		a++;
		b--;
		System.out.println(a + " " + b);

		Data d1 = new Data(1, 6, 2022);
		Data d2 = d1; // atribui��o por refer�ncia (Objeto).

		d1.dia = 31;
		d2.mes = 12;

		d1.ano = 2025;

		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());

		voltarDataParaValorPadrao(d1);

		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());

		int c = 5;
		alterarPrimitivo(c);
		System.out.println(c);
	}

	// Um m�todo est�tico consegue acessar outro m�todo est�tico.
	// Este m�todo est� alterando um objeto. N�o � uma boa pr�tica de
	// programa��o. O que � alterado no objeto dentro do m�todo, ser�
	// refletido fora quando acessado o objeto.
	static void voltarDataParaValorPadrao(Data d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}

	// O que � modificado dentro da vari�vel primitiva n�o ser� refletida
	// fora do m�todo. O valor do par�metro continuar� com o seu valor de
	// entrada.
	static void alterarPrimitivo(int a) {
		a++;
	}
}
