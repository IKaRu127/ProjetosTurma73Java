package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class CoresArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String entrada;
		ArrayList<String> cores = new ArrayList<>();
		
		Scanner leia = new Scanner(System.in);
			
		System.out.println("------------------------");
		System.out.println(" ORDENAÇÃO DE CORES ");
		System.out.println("------------------------");
		
		for(int i = 1; i<=5; i++) {
			System.out.print("Digite aqui a " + i + "° cor ==> ");
			entrada = leia.nextLine();
			cores.add(entrada);
		}
		
		System.out.println("------------------------");
		System.out.println("Cores adicionadas: ");
		for(String cor: cores) {
			System.out.println(cor);
		}
		
		System.out.println("------------------------");
		System.out.println("Cores adicionadas em ordem alfabética: ");
		cores.sort(null);
		for(String cor: cores) {
			System.out.println(cor);
		}
	
	leia.close();
	
	
	
	
	}

}
