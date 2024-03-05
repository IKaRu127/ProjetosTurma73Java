package collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class EncontrarNumeroSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int entrada;
		Set<Integer> listaNumeros = new HashSet<Integer>();
		Scanner leia = new Scanner(System.in);
		
		listaNumeros.add(2);
		listaNumeros.add(5);
		listaNumeros.add(1);
		listaNumeros.add(3);
		listaNumeros.add(4);
		listaNumeros.add(9);
		listaNumeros.add(7);
		listaNumeros.add(8);
		listaNumeros.add(10);
		listaNumeros.add(3);
		
		
		System.out.println("------------------------");
		System.out.println(" ENCONTRAR O NÚMERO NA LISTA ");
		System.out.println("------------------------");
		System.out.print("Digite o número que você deseja encontrar ==> ");
		entrada = leia.nextInt();
		
		if (listaNumeros.contains(entrada)) {
			System.out.println("O número " + entrada + " foi encontrado!!");
		} else {
			System.out.println("O número " + entrada + " não foi encontrado!!");
		}
		leia.close();
	}

}
