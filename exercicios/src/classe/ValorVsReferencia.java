package classe;

public class ValorVsReferencia {
	public static void main(String[] args) {
		double a = 2;
		double b = a; // atribuição por valor (Tipo primitivo).
		a++;
		b--;
		System.out.println(a + " " + b);

		Data d1 = new Data(1, 6, 2022);
		Data d2 = d1; // atribuição por referência (Objeto).

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

	// Um método estático consegue acessar outro método estático.
	// Este método está alterando um objeto. Não é uma boa prática de
	// programação. O que é alterado no objeto dentro do método, será
	// refletido fora quando acessado o objeto.
	static void voltarDataParaValorPadrao(Data d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}

	// O que é modificado dentro da variável primitiva não será refletida
	// fora do método. O valor do parâmetro continuará com o seu valor de
	// entrada.
	static void alterarPrimitivo(int a) {
		a++;
	}
}
