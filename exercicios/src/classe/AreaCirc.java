package classe;

public class AreaCirc {
	double raio;
	static final double PI = 3.14;
//	final static double pi = 3.14;
//	N�o importa a ordem de static final ou final static.
//	A �nica ordem a ser obedecida � do tipo de dados e o nome 
//	na seguinte sequ�ncia.

	public AreaCirc(double raioInicial) {
		raio = raioInicial;
	}

	public double area() {
		return PI * Math.pow(raio, 2);
	}

//	static � um modificador de acesso de classe.
	public static double area(double raio) {
		return PI * Math.pow(raio, 2);
	}
}
