package fundamentos.operadores;

public class DesafioAritmeticos1 {
	public static void main(String[] args) {
		double numA = 6*(3+2);
	    double superiorA = Math.pow(numA, 2);
		
	    double denA = 3*2;
		double operadorA = superiorA / denA;
		
		double numB = (1-5)*(2-7);
		double denB = 2;
		
		double superiorB = Math.pow(numB/denB, 2);
		double inferior = Math.pow(10, 3);
		
		double superior = Math.pow(operadorA-superiorB, 3);
		double resultado = superior/inferior;
		
		System.out.printf("Resultado = %f%n",  resultado);
	}
}
