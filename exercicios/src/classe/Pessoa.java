package classe;

public class Pessoa {
	String nome = null;
	double peso = 0.0;

	public Pessoa(String nome, double peso) {
		this.nome = nome;
		this.peso = peso;
	}

	public double comer(Comida c) {
		if (c != null) {
			this.peso += c.peso;
		}
		return this.peso;
	}
}
