package desafioDeCodigos;

import java.util.Scanner;

public class Exercicio_2 {
	
public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Entre com uma frase: ");
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
		
		System.out.println(frase);
		
		entrada.close();
	}
}
