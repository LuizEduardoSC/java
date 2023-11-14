package aula_06;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Atividade01_Fila {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		Queue<String> clientes = new LinkedList<String>();
		
		String nome;
		
		int escolha;
		
		do {
			
			System.out.println("******************************************");
			
			System.out.println("1 - Adicionar Cliente na Fila ");
			
			System.out.println("2 - Listar Todos os Clientes ");

			System.out.println("3 - Retirar Cliente da Fila ");
			
			System.out.println("0 - Sair ");
			
			System.out.println("******************************************");
			
			System.out.println("Entre com a opção desejada: ");
			
			escolha = leia.nextInt();
			
			switch (escolha) {
                case 1:
            	    System.out.println("Digite o nome: ");
            	    nome = leia.nextLine();
            	    clientes.add(nome);
            	    System.out.println("Cliente Adicionado! ");
                break;
                
                case 2:
                    System.out.println("Lista de Clientes na Fila: ");
            	    leia.nextLine();            	
            	    System.out.println("\nFila: ");
            	    System.out.println("Cliente Adicionado! ");
                break;
                
                case 3:
                    System.out.println("Lista de Clientes na Fila: ");
                	leia.nextLine();           
                	System.out.println("\nFila: ");
                	System.out.println("Cliente Adicionado! ");
                    break;
                
                case 0:
                	System.out.println("Programa Finalizado! ");
            	    leia.nextLine();
                    break;
                    default:
                
                System.out.println("Opção inválida.");
                break;
		}
		} while (escolha != 0);
	}
}
