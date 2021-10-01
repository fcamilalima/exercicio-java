package fundamentos;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
		//Informações do funcionário

		// Tipos numéricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L;
		// _ -> Underline = Separação para melhor leitura de número na casa 
		// de mil ou milhões. Um inteiro no valor de 2 milhões pode ser 
		// representado por int (inteiro). A partir de 3 milhões, o literal 
        // só caberá dentro de um tipo long e representado com um l ou L 
        // (maiúsculo ou minúsculo) no fim do literal.
		
        // Tipos numéricos reais.
		float salario = 11_445.44F; // Representa-se um dado float om F no 
		// fim (maiúscula ou minúscula).
		double vendasAcumuladas = 2_991_797_103.01;
		
        // Tipo booleano.
		boolean estaDeFerias = false;  // true ou false. Não aceita zero ou um
        // como um valor booleano.
		
        // Tipo caracter.
		char status = 'A';
		// char caracter = '\u0010';
		
		// Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		// Número de viagens
		System.out.println(numeroDeVoos / 2);
		
		// Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha -> " + salario);
		System.out.println("Férias? " + estaDeFerias);
		System.out.println("Status: " + status);
		
		
	}
}
