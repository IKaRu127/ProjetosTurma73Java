package exercicioslacocondicional;

import java.util.Scanner;

public class IndicandoNumeros {

	public static void main(String[] args) {
		// Laços Condicionais|| Exercício 2 - Algoritmo que recebe um numero e indica se ele é positivo ou negativo e se é par ou impar
		int numero;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("------------------------");
		System.out.println(" PROPRIEDADES DE UM NÚMERO ");
		System.out.println("------------------------");
		
		System.out.print(" Digite um número ==> ");
		numero = leia.nextInt();
		
		if(numero%2 == 0 && numero >= 0) {
			System.out.printf("O número %d é par e positivo!", numero);
		} else if(numero%2 == 0 && numero < 0) {
			System.out.printf("O número %d é par e negativo!", numero);
		} else if(numero%2 != 0 && numero >= 0) {
			System.out.printf("O número %d é ímpar e positivo!", numero);
		} else {
			System.out.printf("O número %d é ímpar e negativo!", numero);
		}
		leia.close();
	}

}
