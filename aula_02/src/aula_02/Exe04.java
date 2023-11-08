package aula_02;

import java.util.Scanner;

public class Exe04 {
	
	static Scanner Leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		float n1, n2, n3, n4;	
		
		System.out.println("Digite o primeiro número: ");
		n1 = Leia.nextFloat();
		
		System.out.println("Digite o segundo número: ");
		n2 = Leia.nextFloat();
		
		System.out.println("Digite o terceiro número: ");
		n3 = Leia.nextFloat();
		
		System.out.println("Digite o quarto número: ");
		n4 = Leia.nextFloat();
		
	

        float diferenca = (n1 * n2) - (n3 * n4);


        System.out.println("Diferença: " + diferenca);
		
		

		

	}

}
