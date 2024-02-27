package exerciciosaula1;

import java.util.Scanner;

public class QuatroValores {

	public static void main(String[] args) {
		// Exercício 4: Algoritmo que recebe quatro números e calcula a diferença entre os produtos dos mesmos
		float num1;
		float num2;
		float num3;
		float num4;
		float resultado;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("------------------------");
		System.out.println(" ALGORITMO DIFERENÇA ENTRE PRODUTOS ");
		System.out.println("------------------------");
		System.out.print("Digite o 1° número => ");
		num1 = leia.nextFloat();
		System.out.print("Digite o 2° número => ");
		num2 = leia.nextFloat();
		System.out.print("Digite o 3° número => ");
		num3 = leia.nextFloat();
		System.out.print("Digite o 4° número => ");
		num4 = leia.nextFloat();
		resultado = (num1*num2) - (num3*num4);
		
		System.out.printf("O resultado da diferença entre os produtos é de %.1f", resultado);
		leia.close();
	}

}
