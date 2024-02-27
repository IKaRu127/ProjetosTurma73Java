package exerciciosaula2;

import java.util.Scanner;

public class FormatarSegundos {

	public static void main(String[] args) {
		// Exercício 3: Algoritmo que recebe um número de segundos e retorna no formato hh:mm:ss
		
		int entrada, horas, minutos, segundos;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("------------------------");
		System.out.println(" CONVERSÃO DE TEMPO ");
		System.out.println("------------------------");
		
		System.out.print("Insira o tempo em segundos ==> ");
		entrada = leia.nextInt();
		segundos = entrada;
		horas = segundos/3600;
		segundos %=3600;
		minutos = segundos/60;
		segundos %= 60;
		
		
		System.out.printf(entrada + " segundos é igual a %d:%d:%d", horas, minutos, segundos);
		leia.close();
				
	}

}
