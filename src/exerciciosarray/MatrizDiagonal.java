package exerciciosarray;

import java.util.Scanner;

public class MatrizDiagonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int matriz [][] = new int[3][3], indiceColuna, indiceLinha, somaPrincipal = 0, somaSecundaria = 0;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("------------------------");
		System.out.println("   DIAGONAL DAS MATRIZES ");
		System.out.println("------------------------");

		for(indiceLinha = 0; indiceLinha < 3; indiceLinha++) {
			for(indiceColuna = 0; indiceColuna <3; indiceColuna++) {
				System.out.printf(" Digite o número da posição [%d][%d] da matriz ==> ", indiceLinha, indiceColuna);
				matriz[indiceLinha][indiceColuna] = leia.nextInt();
			}
		}
		System.out.println("------------------------");
		System.out.println("Elementos da diagonal principal: ");
		for(int i =0; i < matriz.length; i++) {
			System.out.print(matriz[i][i]+ " ");
			somaPrincipal += matriz[i][i];
		}
		
		System.out.println("\nElementos da diagonal secundária: ");
		for(int i =0; i < matriz.length; i++) {
			System.out.print(matriz[i][2-i] + " ");
			somaSecundaria += matriz[i][2-i];
		}
		
		System.out.println("\nSoma dos elementos da diagonal principal: " + somaPrincipal);
		System.out.println("Soma dos elementos da diagonal secundária: " + somaSecundaria);
		System.out.println("------------------------");

		leia.close();
		}
	}
