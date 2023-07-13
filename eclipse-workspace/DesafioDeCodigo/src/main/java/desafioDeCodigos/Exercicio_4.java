package desafioDeCodigos;

import java.util.Scanner;

public class Exercicio_4 {
	
	public static void main(String[] args) {
		
		/* Lógica:																			*
		 * Percorre a frase, o primeiro caractere é colocado em maiúsculo e a partir		*
		 * do segundo caractere verifica-se se o caractere anterior foi algum ponto			*
		 * que exige o proximo caractere a ser maiusculo, se for, verifica se o caractere	*
		 * atual é um espaço, se for, coloca o proximo caractere como maiúsculo, se não,	*
		 * adiciona um espaço após o ponto e coloca o caractere atual como maiúsculo. 		*/
		
		Scanner entrada = new Scanner(System.in);
		StringBuffer stringBuffer = new StringBuffer();
		
		System.out.println("4 - Converte para maiusculo o primeiro caractere de cada frase\n\nEntre com uma frase: ");
		String frase = entrada.nextLine();
		
		for(int i=0;i<frase.length(); i++) {
			char c = frase.charAt(i);
			
			if(i==0) {
				c = Character.toUpperCase(frase.charAt(i));
				stringBuffer.append(c);
				continue;
			}
			
			switch(frase.charAt(i-1)) {
				case '.':
				case '?':
				case '!':
				case '-':
				case ';':
				case ':':
					if(frase.charAt(i) == ' ') {
						stringBuffer.append(c);
						stringBuffer.append(Character.toUpperCase(frase.charAt(i+1)));
						i+=1;
					} else {
						stringBuffer.append(' ');
						stringBuffer.append(Character.toUpperCase(frase.charAt(i)));
					}
					break;
					
				default:
					stringBuffer.append(c);
					break;
			}
		}
		
		System.out.println(stringBuffer.toString());
		
		entrada.close();
			
	}
}
