package exerciciosaula1;

import java.util.Scanner;

public class MediaFinal {

	public static void main(String[] args) {
		// Exercício 2: Algoritmo que recebe quatro notas de um determinado aluno e retorna a média
		String nome;
		float nota1;
		float nota2;
		float nota3;
		float nota4;
		float media;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("------------------------");
		System.out.println(" ALGORITMO CALCULAR A MÉDIA ");
		System.out.println("------------------------");
		System.out.print("Digite o nome do participante => ");
		nome = leia.next();
		System.out.print("Digite a 1° nota => ");
		nota1 = leia.nextFloat();
		System.out.print("Digite a 2° nota => ");
		nota2 = leia.nextFloat();
		System.out.print("Digite a 3° nota => ");
		nota3 = leia.nextFloat();
		System.out.print("Digite a 4° nota => ");
		nota4 = leia.nextFloat();
		media = (nota1 + nota2 + nota3 + nota4)/4;
		
		System.out.printf("O participante " + nome + " tem a média final de %.1f", media);
		leia.close();
	}

}
