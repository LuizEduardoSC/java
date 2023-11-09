package aula_03;

import java.util.Scanner;

public class Exe03 {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		int cod, quant;
		double valor_total, valor;
		String prod;
		
		System.out.println("Código do Produto: ");
		cod = leia.nextInt();
		System.out.println("Quantidade: ");
		quant = leia.nextInt();

		switch(cod) {
			case 1:
				valor = 10.00;
				prod = "Cachorro Quente";
				break;
			case 2:
				valor = 15.00;
				prod = "X-Salada";
				break;
			case 3:
				valor = 18.00;
				prod = "X-Bacon";
				break;
			case 4:
				valor = 12.00;
				prod = "Bauru";
				break;
			case 5:
				valor = 8.00;
				prod = "Refrigerante";
				break;
			case 6:
				valor = 13.00;
				prod = "Suco de laranja";
				break;
			default:
				valor = 0;
				prod = "Produto inválido";
		}
		
		valor_total = (quant*valor);
		
		System.out.printf("Produto: %s\nValor total: R$ %.2f\n", prod,  valor_total);
		
		
	

	}

}
