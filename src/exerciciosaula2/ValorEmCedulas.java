package exerciciosaula2;

import java.util.Scanner;

public class ValorEmCedulas {

	public static void main(String[] args) {
		// Exercício 4: Algoritmo que pega um valor e mostra em cédulas
		int reais, valor, cem, cinquenta, vinte, dez, cinco, dois, um;
		
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("------------------------");
		System.out.println(" CONVERSÃO DE CÉDULAS ");
		System.out.println("------------------------");
		
		System.out.print("Insira o valor em reais ==> R$");
		reais = leia.nextInt();
		valor = reais;
		cem = valor/100;
		valor %= 100;
		cinquenta = valor/50;
		valor %= 50;
		vinte = valor/20;
		valor %= 20;
		dez = valor/10;
		valor %= 10;
		cinco = valor/5;
		valor %= 5;
		dois = valor/2;
		valor %= 2;
		um = valor/1;
		valor %= 1;
		
		System.out.println("------------------------");
		System.out.println(" RESULTADO ");
		System.out.println("------------------------");
		
		System.out.println("R$ " + reais + ": ");
		System.out.printf("%f nota(s) de R$100,00\n", cem);
		System.out.printf("%f nota(s) de R$50,00\n", cinquenta);
		System.out.printf("%f nota(s) de R$20,00\n", vinte);
		System.out.printf("%f nota(s) de R$10,00\n", dez);
		System.out.printf("%f nota(s) de R$5,00\n", cinco);
		System.out.printf("%f nota(s) de R$2,00\n", dois);
		System.out.printf("%f nota(s) de R$1,00\n",um);
		
		leia.close();
		
		
	}

}
