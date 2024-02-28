package exercicioslacocondicional;

import java.util.Scanner;

public class SalarioReajustado {

	public static void main(String[] args) {
		// Laços Condicionais - SWITCH CASE|| Exercício 6 - Algoritmo que calcula o salárrio reajustado de cada funcionarrio
		int codigo;
		float salario, novoSalario;
		String colaborador;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("------------------------");
		System.out.println("   CÁLCULO DE REAJUSTE NO SALÁRIO ");
		System.out.println("------------------------");
		System.out.print(" Digite o nome do colaborador ==> ");
		colaborador = leia.nextLine();
		System.out.print(" Digite o salário do colaborador ==> R$");
		salario = leia.nextFloat();
		System.out.println(" CÓDIGO DO CARGO |  CARGO ");
		System.out.println(" [ 1 ] - Gerente");
		System.out.println(" [ 2 ] - Vendedor");
		System.out.println(" [ 3 ] - Supervisor" );
		System.out.println(" [ 4 ] - Motorista" );
		System.out.println(" [ 5 ] - Estoquista" );
		System.out.println(" [ 6 ] - Técnico de TI" );
		System.out.println(" [ 7 ] - SAIR ");
		System.out.print(" Digite o código do cargo do colaborador ==> ");
		codigo = leia.nextInt();

		if(codigo != 7) {
			switch(codigo) {
			case 1:
				novoSalario = salario + (salario*0.1f);
				System.out.printf("Nome do colaborador: %s \nCargo: Gerente \nAntigo salário: R$%f \nSalário Reajustado: R$%f", 
						colaborador, salario, novoSalario);
				break;
			case 2:
				novoSalario = salario + (salario*0.07f);
				System.out.printf("Nome do colaborador: %s \nCargo: Vendedor \nAntigo salário: R$%f \nSalário Reajustado: R$%f", 
						colaborador, salario, novoSalario);
				break;
			case 3:
				novoSalario = salario + (salario*0.09f);
				System.out.printf("Nome do colaborador: %s \nCargo: Supervisorr \nAntigo salário: R$%f \nSalário Reajustado: R$%f", 
						colaborador, salario, novoSalario);
				break;
			case 4:
				novoSalario = salario + (salario*0.06f);
				System.out.printf("Nome do colaborador: %s \nCargo: Motorista \nAntigo salário: R$%f \nSalário Reajustado: R$%f", 
						colaborador, salario, novoSalario);
				break;
			case 5:
				novoSalario = salario + (salario*0.05f);
				System.out.printf("Nome do colaborador: %s \nCargo: Estoquista \nAntigo salário: R$%f \nSalário Reajustado: R$%f", 
						colaborador, salario, novoSalario);
				break;
			case 6:
				novoSalario = salario + (salario*0.08f);
				System.out.printf("Nome do colaborador: %s \nCargo: Técnico de TI \nAntigo salário: R$%f \nSalário Reajustado: R$%f %.2f", 
						colaborador, salario, novoSalario);
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
