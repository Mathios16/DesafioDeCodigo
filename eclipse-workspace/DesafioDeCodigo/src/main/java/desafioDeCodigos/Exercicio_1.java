package desafioDeCodigos;

import java.util.Stack;
import java.util.Scanner;

public class Exercicio_1 {
	
	public static void main(String[] args) {
		
		/* Lógica:																*
		 * É utilizado uma pilha de Strings que recebe a frase quebrada nos 	*
		 * espaços e depois desempilha-a para ordem de exibição ser invertida. 	*/
		
		Scanner entrada = new Scanner(System.in);
		Stack<String> frase = new Stack<>();
	
		System.out.println("1 - Inversão da ordem das palavras\n\nEntre com uma frase: ");
		for(String palavra:entrada.nextLine().split(" "))
			frase.push(palavra);
		
		System.out.println("\nA frase de saída será: ");
		while(!frase.isEmpty())
			System.out.print(frase.pop()+" ");
		
		entrada.close();
		
	}
}
