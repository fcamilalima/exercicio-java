package fundamentos;

public class ConversaoNumeroString {
	public static void main(String[] args) {
		Integer num1 = 10000; // Declara��o de vari�vel usando Wrapper.
		System.out.println(num1.toString().length()); // Convertendo um n�mero
		// para string.
		
		int num2 = 100000;
		System.out.println(Integer.toString(num2).length());
		
		System.out.println((""+num1).length());
		System.out.println((""+num2).length());
	}
}
