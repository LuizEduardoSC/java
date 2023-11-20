package atividade01;

import static atividade01.Cliente.*;
import java.util.Scanner;

public class TestaCliente {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Cliente c1 = new Cliente (1, 888, 2, "Luiz Eduardo", 890000.00f);
		System.out.println("Informações do C1: ");
		c1.visualizar();
		/*System.out.println("Número: " + c1.getNumero());
	    System.out.println("Agência: " + c1.getAgencia());
	    System.out.println("Tipo: " + c1.getTipo());
	    System.out.println("Titular: " + c1.getTitular());
	    System.out.println("Saldo: " + c1.getSaldo());*/
		
		Cliente c2 = new Cliente (2, 888, 1, "Vitória", 980000.00f);
		System.out.println("\nInformações do C2: ");
		c2.visualizar();
		/*System.out.println("Número: " + c2.getNumero());
	    System.out.println("Agência: " + c2.getAgencia());
	    System.out.println("Tipo: " + c2.getTipo());
	    System.out.println("Titular: " + c2.getTitular());
	    System.out.println("Saldo: " + c2.getSaldo()); */
		}				
	}
