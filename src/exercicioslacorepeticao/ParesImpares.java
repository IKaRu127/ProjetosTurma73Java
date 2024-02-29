package exercicioslacorepeticao;

import java.util.Scanner;

public class ParesImpares {

	public static void main(String[] args) {
		// Laços de Repetição - FOR: Exercício 2: Recebe 10 números inteiros e mostra quantos são pares e quantos são ímpares
		int numero, contador, pares = 0, impares = 0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("------------------------");
		System.out.println("   NÚMEROS PARES E ÍMPARES ");
		System.out.println("------------------------");
		
		for(contador = 1; contador <=10; contador++) {
			System.out.printf("Digite o %d° número ==> ", contador);
			numero = leia.nextInt();
			if(numero%2 == 0) {
				pares++;
			} else {
				impares++;
			}
		}
		System.out.println("Total de números pares: " + pares);
		System.out.println("Total de números ímpares: " + impares);
	}

}
