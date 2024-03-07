package exerciciosestruturadados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CollectionQueue {

	public static void main(String[] args) {
		
		Queue<String> filaBanco = new LinkedList<String>();
		int entrada;
		Scanner leia = new Scanner(System.in);
	
		System.out.println("************************************");
		System.out.println("            FILA DO BANCO           ");
		do {
			System.out.println("************************************");
			System.out.println(" 1 - Adicionar Cliente na Fila");
			System.out.println(" 2 - Listar todos os Clientes");
			System.out.println(" 3 - Retirar Cliente da Fila");
			System.out.println(" 0 - Sair");
			System.out.print("Entre com a opção desejada: ");
			entrada = leia.nextInt();

			switch(entrada) {
			case 1:
				// Adicionar cliente na fila
				System.out.print("Digite o nome do cliente: ");
				filaBanco.add(leia.next());
				System.out.println("Fila atualizada: " + filaBanco + "\nCliente adicionado!\n");
				break;
			case 2: 
				// Listar todos os clientes
				if(filaBanco.isEmpty() == true) {
					System.out.println("A fila está vazia!\n");
				} else {
					System.out.println("Clientes da fila: " + filaBanco + "\n");	
				}
				break;
			case 3:
				// Retirar cliente da fila
				if(filaBanco.isEmpty() == true) {
					System.out.println("A fila está vazia!\n");
				} else {
					filaBanco.remove();
					System.out.println("Fila atualizada: " + filaBanco + "\nUm cliente foi chamado!\n");	
				}
				break;
				
			case 0: 
				// break
				System.out.println("Saindo do programa!\n");
				break;
			default:
				//opção inválida
				System.out.println("Opção inválida! \nTente novamente.\n");
				break;
			}
		} while (entrada != 0);
		
		leia.close();
		
	}

}
