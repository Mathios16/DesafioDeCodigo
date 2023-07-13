package desafioDeCodigos;

import java.util.Scanner;

public class Exercicio_2 {
	
public static void main(String[] args) {
	
		/* Lógica:																	*
		 * É utilizado um array de char que recebe os caracteres da frase e depois 	*
		 * verifica para cada caractere se há outro igual na frase, se houver o 	*
		 * caractere é removido e os proximos caracteres são movidos para trás.		*/
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("2 - Retirada das letras repetidas\n\nEntre com uma frase: ");
		String frase = entrada.nextLine();
		char[] troca;
		
		for(int i=0;i<frase.length(); i++) {
			
			troca = frase.toCharArray();
			
			for(int j=i+1;j<troca.length;j++) 
				if(frase.charAt(i) == troca[j])
					for(int k=j;k<troca.length-1;k++) {
						troca[k] = troca[k+1];
						troca[k+1] = '\0';
					}
			
			frase = String.copyValueOf(troca);
			
		}
		
		System.out.println("\nA frase de saída será: "+frase);
		
		entrada.close();
		
	}
}
