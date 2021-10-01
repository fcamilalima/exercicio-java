package br.com.softplan.report.application;

import java.util.List;
import java.util.function.Consumer;

public class GeradorObservacao { 

	static final String umoNota = "Fatura da nota fiscal de simples remessa: ";
	//Identificador da entidade
	String t = "";
		
	//Gera observações, com texto pre-definido, incluindo os números, das notas fiscais, recebidos no parâmetro.
	public String geraObservacao(List<Integer> args1) 
	{
		return (!args1.isEmpty()) ? retornaCodigos(args1) + "." : "" ;
	}

	//Cria observação.
	private String retornaCodigos(List<Integer> lista2) {
			
		t = (lista2.size() >= 2) ? 
				"Fatura das notas fiscais de simples remessa: " : 
				umoNota;
		
		//Acha separador
		StringBuilder c = new StringBuilder();
		
		Consumer<Integer> consumer = new Consumer<Integer>() {
			public void accept(Integer i) {
				 c.append(", "  + i); 
				 if( c.toString() == null || c.toString().length() <= 0 ) 
					 c.append("" + i); 
				 else
					c.append(" e " + i); 
				
			}
		};
	    
		lista2.forEach(consumer);
		return t + c;
	}
}