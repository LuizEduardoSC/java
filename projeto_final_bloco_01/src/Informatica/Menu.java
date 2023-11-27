package Informatica;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int  opcao, tipo, quantidade;
		String nome, listaProdutos;
		double preco;
		
		while (true) {

			System.out.println("*************************************************");
			System.out.println("                                                 ");
			System.out.println("                 BIG INFORMATICA                 ");
			System.out.println("                                                 ");
			System.out.println("*************************************************");
			System.out.println("                                                 ");
			System.out.println("          1 - Criar Produto                      ");
			System.out.println("          2 - Listar todas os Produtos           ");
			System.out.println("          3 - Consultar Produtos                 ");
			System.out.println("          4 - Atualizar Produtos                 ");
			System.out.println("          5 - Deletar Produto                    ");
			System.out.println("          6 - Sair                               ");
			System.out.println("                                                 ");
			System.out.println("*************************************************");
			System.out.println("Entre com a opção desejada                       ");
			System.out.println("                                                 ");

		
		try {
			opcao = leia.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Digite valores inteiros!");
			leia.nextLine();
			opcao = 0;


		if (opcao == 6) {
			System.out.println("\nBig Informática - A sua loja de Informática!");
			leia.close();
			System.exit(0);
		}
		}
		switch (opcao) {
		case 1: System.out.println("Digite o nome do Produto\n\n");
		break;
		
		case 2: System.out.println("Listar todos os Produtos\n\n");
		break;
		
		case 3: System.out.println("Consultar dados da Conta - por número\n\n");
		break;
		
		case 4: System.out.println("Atualizar dados da Conta\n\n");
		break;
		
		case 5: System.out.println("Digite o produto que quer apagar\n\n");
		break;
		
		
		default:
			System.out.println("\nOpção Inválida! \n");
			break;
		 }
	   }
     }

	public static void sobre() {
		System.out.println("\n*************************************************");
		System.out.println("Projeto Desenvolvido por: Luiz Eduardo!");
		System.out.println("Luiz Eduardo - luizeduardoedd1@gmail.com");
		System.out.println("github.com/LuizEduardoSC");
		System.out.println("*************************************************");
	}
}
