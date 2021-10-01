package fundamentos;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
		//Informa��es do funcion�rio

		// Tipos num�ricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L;
		// _ -> Underline = Separa��o para melhor leitura de n�mero na casa 
		// de mil ou milh�es. Um inteiro no valor de 2 milh�es pode ser 
		// representado por int (inteiro). A partir de 3 milh�es, o literal 
        // s� caber� dentro de um tipo long e representado com um l ou L 
        // (mai�sculo ou min�sculo) no fim do literal.
		
        // Tipos num�ricos reais.
		float salario = 11_445.44F; // Representa-se um dado float om F no 
		// fim (mai�scula ou min�scula).
		double vendasAcumuladas = 2_991_797_103.01;
		
        // Tipo booleano.
		boolean estaDeFerias = false;  // true ou false. N�o aceita zero ou um
        // como um valor booleano.
		
        // Tipo caracter.
		char status = 'A';
		// char caracter = '\u0010';
		
		// Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		// N�mero de viagens
		System.out.println(numeroDeVoos / 2);
		
		// Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha -> " + salario);
		System.out.println("F�rias? " + estaDeFerias);
		System.out.println("Status: " + status);
		
		
	}
}
