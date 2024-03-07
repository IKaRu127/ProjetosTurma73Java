package exerciciosestruturadados;

import java.util.Scanner;
import java.util.Stack;

public class CollectionStack {

	public static void main(String[] args) {
		
		Stack<String> pilhaLivros = new Stack<String>();
		int entrada;
		Scanner leia = new Scanner(System.in);
		System.out.println("************************************");
		System.out.println("          PILHA DE LIVROS           ");
		do {
			System.out.println("************************************");
			System.out.println(" 1 - Adicionar Livro na pilha");
			System.out.println(" 2 - Listar todos os Livros");
			System.out.println(" 3 - Retirar Livro da pilha");
			System.out.println(" 0 - Sair");
			System.out.print("Entre com a opção desejada: ");
			entrada = leia.nextInt();
			switch(entrada) {
			case 1:
				// Adicionar cliente na fila
				System.out.print("Digite o nome do livro: ");
				pilhaLivros.push(leia.next());
				System.out.println("Fila atualizada: " + pilhaLivros + "\nLivro Adicionado!\n");
				break;
			case 2: 
				// Listar todos os clientes
				if(pilhaLivros.isEmpty() == true) {
					System.out.println("A Pilha está vazia!\n");
				} else {
					System.out.println("Lista de livros na pilha: \n" + pilhaLivros + "\n");	
				}
				break;
			case 3:
				// Retirar cliente da fila
				if(pilhaLivros.isEmpty() == true) {
					System.out.println("A Pilha está vazia!\n");
				} else {
					pilhaLivros.pop();
					System.out.println("Fila atualizada: " + pilhaLivros + "\nUm livro foi retirado!\n");	
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
			
			
		} while(entrada !=0);

		leia.close();
	}

}
