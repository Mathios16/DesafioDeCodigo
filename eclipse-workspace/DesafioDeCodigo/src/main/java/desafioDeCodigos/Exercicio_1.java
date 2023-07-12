package desafioDeCodigos;

import java.util.Stack;
import java.util.Scanner;

public class Exercicio_1 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		Stack<String> frase = new Stack<>();
	
		System.out.println("Entre com uma frase: ");
		for(String palavra:entrada.nextLine().split(" "))
			frase.push(palavra);
		
		System.out.println("\nA frase de saida será: ");
		while(!frase.isEmpty())
			System.out.print(frase.pop()+" ");
		
		entrada.close();
	}
}
