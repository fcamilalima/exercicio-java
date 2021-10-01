package fundamentos;

public class Inferencia {
	public static void main(String[] args) {
		
		double a = 4.5;
		System.out.println("a = " + a);
		
		var b = 4.5;
		System.out.println("b = " + b);
		
		var c = "Texto"; // A palavra-chave var indica uma conclusão do tipo de 
		// dados pelas características da atribuição do dado.
		System.out.println("c = " + c);
		
		c = "Outro Texto";
		System.out.println("c = " + c);
		
		double d;  // variável foi declarada.
		d = 123.65; // variável foi inicializada.
		System.out.println("d = " + d);
		
		var e = 123.65; // Depois de inferida, o tipo não muda dinamicamente. 
		// Java, diferente de Javascript, não é tipicamente fraca com tipagem 
        // dinâmica dos dados.
		System.out.println("e = " + e);
	}
}
