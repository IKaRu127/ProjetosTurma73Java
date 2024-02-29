package exercicioslacorepeticao;

import java.util.Scanner;

public class IdadeVinteCinquenta {

	public static void main(String[] args) {
		/** Laço de repetição - WHILE | Exercício 3 - Algoritmo recebe a idade de várias pessoas até a idade digitada ser negativa, 
		 * e depois classifica quem é menor que 21 e maior que 50.
		 */
		
		int idade = 0, menos21 = 0, mais50 = 0;
		
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("------------------------");
		System.out.println("   RECEPTOR DE IDADES ");
		System.out.println("------------------------");
		
		while (idade >= 0) {
			System.out.print(" Digite uma idade ==> ");
			idade = leia.nextInt();
			if(idade > 50) {
				mais50++;
			} else if(idade < 21 && idade >=0){
				menos21++;
			}
		}
		System.out.println("------------------------");
		System.out.println("Total de pessoas menores de 21 anos: " + menos21);
		System.out.println("Total de pessoas maiores de 50 anos: " + mais50);
		leia.close();
	}

}
