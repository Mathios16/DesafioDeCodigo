package desafioDeCodigos;

import java.util.Scanner;

public class Exercicio_3 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		StringBuffer stringBuffer = new StringBuffer();
		
		System.out.println("Entre com uma frase: ");
		String frase = entrada.nextLine();
		String controle, palindromo = "Não há palindromo";
		
		for(int i=1;i<frase.length();i++) {	
			
			for(int j=0;j<i;j++) 
				stringBuffer.append(frase.charAt(j));
			controle = frase.substring(0, i);

			if(controle.equals(stringBuffer.reverse().toString()))
				palindromo = controle;
			
			
			stringBuffer.delete(0, stringBuffer.length());
		}
		
		System.out.println(palindromo);
		
		entrada.close();
		
	}
	
}
