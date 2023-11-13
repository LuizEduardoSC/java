package aula_05;

import java.util.Scanner;

public class Exe02 {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		int [] vetor = new int[10];	
		int soma = 0; 
		double media = 0;
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.println("Digite o " + (i + 1) + "° número: ");
			vetor[i] = leia.nextInt();
			
		soma += vetor[i];
		}
		
		media = (double) soma / vetor.length;
		
		
		System.out.println("Elementos nos índices ímpares: ");
		    for(int i = 0; i < vetor.length; i++) {
		    	if (i % 2 != 0) {
		    System.out.print(vetor[i] + " ");	
		    	}
		}

		    System.out.println("\nElementos nos índices pares: ");
		    for(int i = 0; i < vetor.length; i++) {
		    	if(vetor[i] % 2 == 0) {
		    System.out.print(vetor[i] + " ");
		    	}
		    }
		    
	    System.out.println("\nSoma:" + soma);
	    System.out.printf("Média %.2f:" , media);
	}
}
