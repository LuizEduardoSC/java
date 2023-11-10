package aula_03;

import java.util.Scanner;

public class Exe06 {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		int codigoCC;
		double salario, novoSal, reajuste;
		String nomeC, cargo;
		
		System.out.println("Nome do colaborador: ");
		nomeC = leia.nextLine();
		System.out.println("Cargo: ");
		codigoCC = leia.nextInt();
		System.out.println("Salário: R$ ");
		salario = leia.nextDouble();

		switch(codigoCC) {
			case 1:
				reajuste = 0.1;
				cargo = "Gerente";
				break;
			case 2:
				reajuste = 0.07;
				cargo = "Vendedor";
				break;
			case 3:
				reajuste = 0.09;
				cargo = "Supervisor";
				break;
			case 4:
				reajuste = 0.06;
				cargo = "Motorista";
				break;
			case 5:
				reajuste = 0.05;
				cargo = "Estoquista";
				break;
			case 6:
				reajuste = 0.08;
				cargo = "Técnico de TI";
				break;
			default:
				reajuste = 0;
				cargo = "Cargo Inválido";
		}
		
		novoSal = (salario + (salario*reajuste));
		
		
		System.out.printf("\nNome do colaborador: %s\nCargo: %s\nSalário: R$ %.2f\n", nomeC, cargo, novoSal);

	}

}
