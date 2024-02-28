package exercicioslacocondicional;

import java.util.Scanner;

public class CardapioRestaurante {

	public static void main(String[] args) {
		// Laços Condicionais - SWITCH CASE|| Exercício 5 - Algoritmo que simula a escolha de um item do cardapio
				int codigo, quant, valor;
				
				Scanner leia = new Scanner(System.in);
				
				System.out.println("------------------------");
				System.out.println("     CARDÁPIO DIGITAL ");
				System.out.println("------------------------");
				System.out.println(" CÓDIGO |  PRODUTO  |  VALOR ");
				System.out.println(" [ 1 ] - Cachorro Quente | R$10,00" );
				System.out.println(" [ 2 ] - X-SALADA | R$15,00" );
				System.out.println(" [ 3 ] - X-BACON | R$18,00" );
				System.out.println(" [ 4 ] - Bauru | R$12,00" );
				System.out.println(" [ 5 ] - Refrigerante | R$8,00" );
				System.out.println(" [ 6 ] - Suco de Laranja | R$13,00" );
				System.out.println(" [ 7 ] - SAIR ");
				System.out.print(" Digite o código do produto desejado ==> ");
				codigo = leia.nextInt();
				if(codigo != 7) {
					System.out.print(" Digite a quantidade ==> ");
					quant = leia.nextInt();
					
					switch(codigo) {
					case 1:
						valor = quant*10;
						System.out.printf("Produto: Cachorro Quente\nValor total: R$%d,00", valor);
						break;
					case 2:
						valor = quant*15;
						System.out.printf("Produto: X-SALADA \nValor total: R$%d,00", valor);
						break;
					case 3:
						valor = quant*18;
						System.out.printf("Produto: X-BACON \nValor total: R$%d,00", valor);
						break;
					case 4:
						valor = quant*12;
						System.out.printf("Produto: Bauru \nValor total: R$%d,00", valor);
						break;
					case 5:
						valor = quant*8;
						System.out.printf("Produto: Refrigerante \nValor total: R$%d,00", valor);
						break;
					case 6:
						valor = quant*13;
						System.out.printf("Produto: Suco de Laranja \nValor total: R$%d,00", valor);
						break;
					default:
						System.out.println(" Opção inválida! Tente novamente ");
						break;
					}
				}else {
					System.out.println(" --PROGRAMA ENCERRADO PELO USUÁRIO-- ");
				}
				
				leia.close();
	}

}
