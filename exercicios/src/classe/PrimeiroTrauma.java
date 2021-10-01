package classe;

public class PrimeiroTrauma {
	int a = 3;
	static int b = 4;
	public static void main(String[] args) {
		PrimeiroTrauma p = new PrimeiroTrauma();
		// Para acessar a variável a, necessito criar uma instância, 
		// um membro de instância para manipular a variável a de 
		// dentro de um método estático. Ou declarar a variável com
		// static, e assim, não precisa criar um objeto para manipular  		
		// a variável.
		System.out.println(p.a);
		System.out.println(PrimeiroTrauma.b);
	}
}
