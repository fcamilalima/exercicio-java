package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	public static void main(String[] args) {
		double a = 1; // Convers�o impl�cita.
		System.out.println(a); // Resposta: 1.0
		
		float b = (float) 1.1234588888;
		System.out.println(b); // Convers�o expl�cita (CAST).
		// Resposta: 1.1234589

		
		int c = 127; // Entrada/ Sa�da: c = 127, Sa�da = 127. 
		// Entrada/ Sa�da: c = 128, Sa�da = -128. 	
		// Entrada/ Sa�da: c = 129, Sa�da = -127. 	
		// Entrada/ Sa�da: c = 240, Sa�da = -16. 	
        // Entrada/ Sa�da: c = 340, Sa�da = 84. 	
		byte d = (byte) c;
		System.out.println(d);
		
		double e = 1.9999999;
		int f = (int) e; // Expl�cita (CAST).
		// Resposta: 1
		System.out.println(f);
	}
}
