package fundamentos;

import java.util.Date;

public class Import {
	/**
	 * @author Camila Lima
	 * @class Aula 27 - Import
	 * @Date 20/08/2021																																															zzzzzz
	 */
	public static void main(String[] args) {
		java.lang.String b = "Boa tarde!"; // O que está dentro de java.lang  
		System.out.println(b); // não se precisa importar. 
		
		String s = "Bom dia";
		System.out.println(s); 
		
		Date d = new Date();
		System.out.println(d);

	}
}
