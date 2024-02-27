package exerciciosaula1;

import java.util.Scanner;

public class NovoSalario {

	public static void main(String[] args) {
		// Exercício 1: Algoritmo que lê um salario e um abono e reproduz o valor do novo salario
		// Declarando váriaveis
		float salario;
		float abono;
		float novoSalario;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("------------------------");
		System.out.println(" ALGORITMO NOVO SALÁRIO ");
		System.out.println("------------------------");
		System.out.print("Digite seu salário atual => R$");
		salario = leia.nextFloat();
		System.out.print("Digite o abono => R$");
		abono = leia.nextFloat();
		novoSalario = salario + abono;
		System.out.printf("O seu novo salário é de => R$%.2f", novoSalario);
		leia.close();
	}

}
