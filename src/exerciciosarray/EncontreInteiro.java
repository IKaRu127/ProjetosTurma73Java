package exerciciosarray;

import java.util.Scanner;

public class EncontreInteiro {

	public static void main(String[] args) {
		// Exercício 1 - Vetor: Algoritmo verifica a posição do número que o usuário coloca no vetor. Caso não exista, ele retorna que não existe.
		
		int vetorInteiro[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6}, entrada;
		boolean confere = false;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("------------------------");
		System.out.println("   BUSCA O NÚMERO NO VETOR ");
		System.out.println("------------------------");
		System.out.print(" Digite um número para verificarmos sua posição no vetor ==> ");
		entrada = leia.nextInt();
		
		for(int posicao = 0; posicao <= 9; posicao++) {
			if (entrada == vetorInteiro[posicao]) {
				System.out.printf("O número %d está na posição %d", entrada, posicao);
				confere = true;
				break;
			}
		}
		if(confere == false) {
			System.out.println("O número " + entrada + " não foi encontrado!");
		}
		
		leia.close();
		

	}

}

