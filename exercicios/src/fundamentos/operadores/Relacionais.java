package fundamentos.operadores;

public class Relacionais {
	public static void main(String[] args) {
		int a = 97;
		// Comportamento estranho de Java abaixo. Este é o número do 
		// caracter a na Tabela UNICODE.
		int b = 'a'; 

		System.out.println(a == b);
		System.out.println(3 > 4); // false
		System.out.println(3 >= 3); // true
		System.out.println(3 < 7); // true
		System.out.println(30 <= 7); // false
		System.out.println(30 != 7); // true
		
		double nota = 7.3;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota>= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		
		System.out.println("Tem desconto? " + (temDesconto ? "Sim." : "Não."));
	}
}
