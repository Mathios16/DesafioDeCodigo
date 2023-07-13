package desafioDeCodigos;

import java.util.Scanner;

public class Exercicio_3 {
	
	public static void main(String[] args) {
		
		/* Lógica:																		*
		 * Percorre a frase pro grupos de no mínimo 2 caracteres e no maxímo a frase 	*
		 * inteira verificando se o grupo é igual a seu inverso, se for, o palindromo 	*
		 * encontrado é armazenado 														*/
		
		Scanner entrada = new Scanner(System.in);
		StringBuffer stringBuffer = new StringBuffer();
		
		System.out.println("3 - Verifica se existe uma subsequencia palindroma\n\nEntre com uma frase: ");
		String frase = entrada.nextLine();
		String controle, palindromo = "Não há palindromo";
		
		for(int i=1;i<frase.length();i++) {	
			for(int j=0;i+j<frase.length();j++) {
				for(int k=j;k<=i+j;k++)
					stringBuffer.append(frase.charAt(k));
				controle = frase.substring(j, i+j+1);

				if(controle.equals(stringBuffer.reverse().toString()))
					palindromo = controle;
				
				stringBuffer.delete(0, stringBuffer.length());
			}
		}
		
		System.out.println(palindromo);
		
		entrada.close();
		
	}
}
