package exercicioslacorepeticao;

import java.util.Scanner;

public class NumerosPositivos {

	public static void main(String[] args) {
		/** Laço de repetição DO WHILE | Exercício 55 - Algoritmo recebe números até o número 0 ser digitado, 
		*e mostra a sooma de todos os números positivos
		*/
		int numero = 0, somaPositivos = 0;
		System.out.println("------------------------");
		System.out.println("   SOMA DOS NÚMEROS POSITIVOS ");
		System.out.println("------------------------");
		
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.print("Digite um número ==> ");
			numero = leia.nextInt();
			if (numero >= 0) {
				somaPositivos = somaPositivos + numero;
			}
			
		} while(numero != 0);
		
		System.out.println("------------------------");
		System.out.println("A soma dos números positivos digitados é: " + somaPositivos);
		
		leia.close();
	}

}
