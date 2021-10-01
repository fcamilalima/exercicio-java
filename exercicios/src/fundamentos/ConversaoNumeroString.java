package fundamentos;

public class ConversaoNumeroString {
	public static void main(String[] args) {
		Integer num1 = 10000; // Declaração de variável usando Wrapper.
		System.out.println(num1.toString().length()); // Convertendo um número
		// para string.
		
		int num2 = 100000;
		System.out.println(Integer.toString(num2).length());
		
		System.out.println((""+num1).length());
		System.out.println((""+num2).length());
	}
}
