package aula_06;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Atividade01_Fila {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		Queue<String> clientes = new LinkedList<String>();
		
		int escolha;
		
		String nome;
		
		while (true) {
			
			System.out.println("******************************************");
			
			System.out.println("                                          ");
			
			System.out.println("1 - Adicionar Cliente na Fila ");
			
			System.out.println("2 - Listar Todos os Clientes ");

			System.out.println("3 - Retirar Cliente da Fila ");
			
			System.out.println("0 - Sair ");
			
			System.out.println("                                          ");
			
			System.out.println("******************************************");
			
			System.out.println("Entre com a opção desejada: ");
			
			escolha = leia.nextInt();
			
			if(escolha == 0) {   /*if = Neste caso serve para validar a entrada e se digitar 0 sai automaticamente do programa*/
				System.out.println("\nPrograma Finalizdo");
				System.exit(0); /*Automaticamente para o seu programa (Equivalente a apertar stop no programa*/
			}
			
			switch (escolha) {
                case 1:
            	    System.out.println("\nDigite o nome: ");
            	    leia.skip("\\R");
            	    nome = leia.nextLine();
            	    
            	    clientes.add(nome);
            	    
            	    System.out.println("\nCliente Adicionado! ");
                break;
                
                case 2:
                	System.out.println("\nListar todos os Clientes na Fila\n\n");
    				
    				Iterator<String> iClientes = clientes.iterator();
    				
    				while(iClientes.hasNext())
    					System.out.println(iClientes.next());
    				
    				break;
                
                case 3:
                	System.out.println("\nRetirar um Cliente da Fila\n\n");
    				
    				if(clientes.isEmpty())
    					System.out.println("\nA Fila está vazia!");
    				else {
    					clientes.remove();
    					System.out.println("\nCliente retirado da fila!");
    				}
    				
    				break;
                
                case 0:
                	System.out.println("Programa Finalizado! ");
            	    leia.nextLine();
                    break;
                    default:/*Informar que esta sendo enviada uma opção inválida*/
                
                System.out.println("Opção inválida.");
                break;
		}
	}
	}
}
