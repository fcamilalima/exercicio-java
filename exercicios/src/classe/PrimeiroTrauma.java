package classe;

public class PrimeiroTrauma {
	int a = 3;
	static int b = 4;
	public static void main(String[] args) {
		PrimeiroTrauma p = new PrimeiroTrauma();
		// Para acessar a vari�vel a, necessito criar uma inst�ncia, 
		// um membro de inst�ncia para manipular a vari�vel a de 
		// dentro de um m�todo est�tico. Ou declarar a vari�vel com
		// static, e assim, n�o precisa criar um objeto para manipular  		
		// a vari�vel.
		System.out.println(p.a);
		System.out.println(PrimeiroTrauma.b);
	}
}
