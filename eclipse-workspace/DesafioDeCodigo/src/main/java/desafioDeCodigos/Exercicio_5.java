package desafioDeCodigos;

import java.util.Scanner;

public class Exercicio_5 {
	
	/* Lógica:																			*
	 * Percorre a frase embaralhando caracter por caracter e verificando se a frase é 	*
	 * palindroma (Exercicio 3), se for, é informado que existe um anagrama palindromo	*
	 * da frase original.																*/
	
	private static Scanner entrada;

	public static boolean VerificaPalin(String frase) {
		
		StringBuffer stringBuffer = new StringBuffer();
		
		String controle;
		boolean palindromo = false;
		
		for(int i=1;i<frase.length();i++) {	
			for(int j=0;i+j<frase.length();j++) {
				
				for(int k=j;k<=i+j;k++)
					stringBuffer.append(frase.charAt(k));
				
				controle = frase.substring(j, i+j+1);

				if(controle.equals(stringBuffer.reverse().toString()))
					palindromo = true;
				
				stringBuffer.delete(0, stringBuffer.length());
			}
		}
		
		return palindromo;
		
	}

	public static void main(String[] args) {
		
		entrada = new Scanner(System.in);
		StringBuffer stringBuffer = new StringBuffer();
		
		System.out.println("5 - Verifica se há um anagrama palindromo\n\nEntre com uma frase: ");
		char[] frase = entrada.nextLine().toCharArray();
		
		for(int i=0;i<frase.length;i++) {	
			for(int j=0;j<frase.length;j++) {
				
				char c = frase[i];
				frase[i] = frase[j];
				frase[j] = c;
				
				for(int k=0;k<frase.length;k++)
					stringBuffer.append(frase[k]);
				
				if(VerificaPalin(stringBuffer.toString())) {
					System.out.println("True");
					return;
				}
					
				stringBuffer.delete(0, stringBuffer.length());
				
			}	
		}
		
		System.out.println("False");
		
		entrada.close();
		
	}
}
