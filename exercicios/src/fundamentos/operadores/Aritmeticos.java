package fundamentos.operadores;

public class Aritmeticos {
	public static void main(String[] args) {
		System.out.println(2 + 3);

		var x = 34.56;
		double y = 2.2;

		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);

		int a = 8;
		int b = 3;

		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b); // Resposta: 2
		System.out.println((double) a / b); // Resposta: 2.6666666666666665
		System.out.println((float) a / b); // Resposta: 2.6666667

		System.out.println(a % b);
		System.out.println(8 % 3);

		System.out.println(x + y - a * b); // Resposta: 12.760000000000005

	}
}
