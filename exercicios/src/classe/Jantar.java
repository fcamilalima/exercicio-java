package classe;

public class Jantar {
	public static void main(String[] args) {
		Comida c1 = new Comida("Feijão", 0.223);
		Comida c2 = new Comida("Arroz", 0.3);
		Pessoa p1 = new Pessoa("Camila", 70.9);

		System.out.printf("Nome: %s%nPeso: %.3fKg.%n", p1.nome, p1.peso);
		System.out.printf("Peso depois do jantar: %.3fKg.%n", p1.comer(c1));
		
	}
}
