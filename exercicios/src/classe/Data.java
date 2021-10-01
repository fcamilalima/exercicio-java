package classe;

public class Data {
	int dia = 0;
	int mes = 0;
	int ano = 0;
	
	final int x = 3;
	// As constantes precisam ser inicializadas no momento da declaração 	
	// ou no construtor, quando o objeto será criado.	
	
	public Data() {
		// dia = 1;
		// mes = 1;
		// ano = 1970;
		this(1, 1, 1970);
		// Só posso chamar this desta forma a partir de um construtor.
		
		// byte, short, int, long -> 0		
		// float, double -> 0.0
		// boolean -> false
		// char -> '\u0000'
		
		// Objetos -> null
		// Variáveis locais são obrigadas a ser inicializadas quando declaradas.		
	}
	
	public Data(int dia, int mes, int ano) {
		// this é usado para diferenciar a variável local da variável 
		// de instância (atributo de instância). Para diferenciar e resolver 
		// conflitos de nomes.
		
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public String obterDataFormatada() {
		final String formato = "%d/%d/%d";
		return String.format(formato, this.dia, this.mes, this.ano); 
	}
	
	void imprimirDataFormatada() {
		System.out.println(obterDataFormatada());
	}
//	static void teste() {
//		this.dia = 3; Não se pode usar this em um contexto estático.
//	                  O método estático está associado a classe (membro de 
//	                  classe).
//	}
}
