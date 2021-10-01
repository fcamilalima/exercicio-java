package fundamentos;

public class Inferencia {
	public static void main(String[] args) {
		
		double a = 4.5;
		System.out.println("a = " + a);
		
		var b = 4.5;
		System.out.println("b = " + b);
		
		var c = "Texto"; // A palavra-chave var indica uma conclus�o do tipo de 
		// dados pelas caracter�sticas da atribui��o do dado.
		System.out.println("c = " + c);
		
		c = "Outro Texto";
		System.out.println("c = " + c);
		
		double d;  // vari�vel foi declarada.
		d = 123.65; // vari�vel foi inicializada.
		System.out.println("d = " + d);
		
		var e = 123.65; // Depois de inferida, o tipo n�o muda dinamicamente. 
		// Java, diferente de Javascript, n�o � tipicamente fraca com tipagem 
        // din�mica dos dados.
		System.out.println("e = " + e);
	}
}
