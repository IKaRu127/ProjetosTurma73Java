package exerciciosaula2;

import java.util.Scanner;

public class DoisInteiros {

	public static void main(String[] args) {
		// Exercício 1: algoritmo que recebe dois inteiros e realiza a soma, diferença, produto e divisão entre eles
		//Declaracao de variaveis
		int num1, num2, soma, sub, produto;
		float divisao;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("------------------------");
		System.out.println(" CÁLCULO ENTRE DOIS NÚMEROS ");
		System.out.println("------------------------");
		
		System.out.print("Digite o 1° número ==> ");
		num1 = leia.nextInt();
		System.out.print("Digite o 2° número ==> ");
		num2 = leia.nextInt();
		soma = num1 + num2;
		sub = num1 - num2;
		produto = num1*num2;
		divisao = num1/num2;
		System.out.println("------------------------");
		System.out.println(" RESULTADO:");
		System.out.println("Soma: " + num1 + "+" + num2 + " = " + soma);
		System.out.println("Subtração: " + num1 + "-" + num2 + " = " + sub);
		System.out.println("Multiplicação: " + num1 + "*" + num2 + " = " + produto);
		System.out.printf("Divisão: " + num1 + "/" + num2 + " = %.2f", divisao);
		System.out.println("\n------------------------");
		leia.close();
	}

}
