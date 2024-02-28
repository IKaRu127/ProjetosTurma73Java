package exercicioslacocondicional;

import java.util.Scanner;

public class SomaMaior {
	public static void main(String[] args) {
		// Laços Condicionais|| Exercício 1 - Algoritmo que recebe 3 valores inteiros, e verifica se a soma dos 2 números é igual, menor ou maior que o terceiro
		int num1, num2, num3;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("------------------------");
		System.out.println(" COMPARAÇÃO DE NÚMEROS ");
		System.out.println("------------------------");
		
		System.out.print(" Digite o 1° número ==> ");
		num1 = leia.nextInt();
		System.out.print(" Digite o 2° número ==> ");
		num2 = leia.nextInt();
		System.out.print(" Digite o 3° número ==> ");
		num3 = leia.nextInt();
		
		if(num1 + num2 < num3) {
			System.out.printf("A soma de %d + %d é menor que %d", num1, num2, num3);
		}else if(num1 + num2 > num3) {
			System.out.printf("A soma de %d + %d é maior que %d", num1, num2, num3);
		} else {
			System.out.printf("A soma de %d + %d é igual a %d", num1, num2, num3);
		}

		leia.close();
	}
}
