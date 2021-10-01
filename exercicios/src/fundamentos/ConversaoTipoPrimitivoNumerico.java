package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	public static void main(String[] args) {
		double a = 1; // Conversão implícita.
		System.out.println(a); // Resposta: 1.0
		
		float b = (float) 1.1234588888;
		System.out.println(b); // Conversão explícita (CAST).
		// Resposta: 1.1234589

		
		int c = 127; // Entrada/ Saída: c = 127, Saída = 127. 
		// Entrada/ Saída: c = 128, Saída = -128. 	
		// Entrada/ Saída: c = 129, Saída = -127. 	
		// Entrada/ Saída: c = 240, Saída = -16. 	
        // Entrada/ Saída: c = 340, Saída = 84. 	
		byte d = (byte) c;
		System.out.println(d);
		
		double e = 1.9999999;
		int f = (int) e; // Explícita (CAST).
		// Resposta: 1
		System.out.println(f);
	}
}
