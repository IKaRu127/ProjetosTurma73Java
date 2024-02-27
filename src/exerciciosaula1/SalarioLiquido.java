package exerciciosaula1;

import java.util.Scanner;

public class SalarioLiquido {

	public static void main(String[] args) {
		// Exercício 3: Algoritmo que lê o salario bruto, adicional noturno, horas extras e descontos e retorna o salário liquido
				// Declarando váriaveis
				float salarioBruto;
				float adcNoturno;
				float horasExtras;
				float descontos;
				float salarioLiquido;
				
				Scanner leia = new Scanner(System.in);
				
				System.out.println("------------------------");
				System.out.println(" ALGORITMO SALÁRIO LIQUÍDO ");
				System.out.println("------------------------");
				System.out.print("Digite o salário bruto => R$");
				salarioBruto = leia.nextFloat();
				System.out.print("Digite o adicional noturno => R$");
				adcNoturno = leia.nextFloat();
				System.out.print("Digite as horas extras => ");
				horasExtras = leia.nextFloat();
				System.out.print("Digite os descontos => R$");
				descontos = leia.nextFloat();
				salarioLiquido = salarioBruto + adcNoturno + (horasExtras*5) - descontos;
				System.out.printf("O salário líquido é de R$%.2f", salarioLiquido);
				leia.close();

	}

}
