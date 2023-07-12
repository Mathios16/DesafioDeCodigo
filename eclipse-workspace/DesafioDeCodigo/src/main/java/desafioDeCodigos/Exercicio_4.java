package desafioDeCodigos;

import java.util.Scanner;

public class Exercicio_4 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		StringBuffer stringBuffer = new StringBuffer();
		
		System.out.println("Entre com uma frase: ");
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
