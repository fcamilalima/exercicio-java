package fundamentos.operadores;

public class DesafioLogicos {
	public static void main(String[] args) {
		// Trabalho na ter�a (V ou F).
		// Trabalho na quinta (V ou F).
		
		// SHIFT + ALT + A => Editar m�ltiplas linhas no Eclipse.		
		boolean trabalho1 = false;
		boolean trabalho2 = false;
		
		boolean comprouTV50 = trabalho1 && trabalho2;
		boolean comprouTV32 = trabalho1 ^ trabalho2;
		boolean comprouSorvete = trabalho1 || trabalho2;
		// Operador un�rio!
		boolean maisSaud�vel = !comprouSorvete;
		
		System.out.println("Comprou TV 50\"? " + (comprouTV50 ? "Sim" : "N�o"));
		System.out.println("Comprou TV 32\"? " + (comprouTV32 ? "Sim" : "N�o"));
		System.out.println("Comprou Sorvete? " + (comprouSorvete ? "Sim" : "N�o"));
		System.out.println("Mais saud�vel? " + (maisSaud�vel ? "Sim" : "N�o"));
		
		/*
		 * boolean trabalhoTerca = false; boolean trabalhoQuinta =false; boolean
		 * comprarTV50 = false; boolean compraTV32 = false; boolean comeuSorvete =
		 * false;
		 * 
		 * if (trabalhoTerca && trabalhoQuinta) { comprarTV50 = true;
		 * System.out.println("Partiu! Comprar TV de 50. o/"); } else if (trabalhoTerca
		 * ^ trabalhoQuinta) { compraTV32 = true;
		 * System.out.println("Partiu! Comprar TV de 32."); }
		 * 
		 * if (compraTV32 ^ comprarTV50) { comeuSorvete = true;
		 * System.out.println("Comemos sorvete :-P "); } else {
		 * System.out.println("Teve nenhum trabalho! :'( ");
		 * System.out.println("N�o comemos sorvete e ficamos mais saud�veis XD!"); }
		 */
	}
}
