package classe;

public class AreaCirc {
	double raio;
	static final double PI = 3.14;
//	final static double pi = 3.14;
//	Não importa a ordem de static final ou final static.
//	A única ordem a ser obedecida é do tipo de dados e o nome 
//	na seguinte sequência.

	public AreaCirc(double raioInicial) {
		raio = raioInicial;
	}

	public double area() {
		return PI * Math.pow(raio, 2);
	}

//	static é um modificador de acesso de classe.
	public static double area(double raio) {
		return PI * Math.pow(raio, 2);
	}
}
