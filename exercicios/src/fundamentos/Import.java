package fundamentos;

import java.util.Date;

public class Import {
	/**
	 * @author Camila Lima
	 * @class Aula 27 - Import
	 * @Date 20/08/2021																																															zzzzzz
	 */
	public static void main(String[] args) {
		java.lang.String b = "Boa tarde!"; // O que est� dentro de java.lang  
		System.out.println(b); // n�o se precisa importar. 
		
		String s = "Bom dia";
		System.out.println(s); 
		
		Date d = new Date();
		System.out.println(d);

	}
}
