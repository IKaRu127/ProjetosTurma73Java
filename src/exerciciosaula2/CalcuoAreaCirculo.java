package exerciciosaula2;

import java.util.Scanner;

public class CalcuoAreaCirculo {

	public static void main(String[] args) {
		// Exercício 2 - Algoritmo que calcula a área de um círculo recebendo o valor do raio
		float raio, area;
		float pi = 3.14159f;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("------------------------");
		System.out.println(" CALCULAR ÁREA DE UM CÍRCULO ");
		System.out.println("------------------------");
		System.out.print("Digite o valor do raio do círculo ==> ");
		raio = leia.nextFloat();
		area = pi*(raio*raio); // melhorar assim que a net voltar
		System.out.printf("A área do círculo é %.4f", area);
		leia.close();
	}

}
