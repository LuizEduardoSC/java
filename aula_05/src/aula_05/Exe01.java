package aula_05;

import java.util.Scanner;

public class Exe01 {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		int [] vetor = {2, 5, 7, 6, 3, 1, 10, 4, 9, 8};
		int numero, numero2, resultado = -1;
		
		System.out.println("{2, 5, 7, 6, 3, 1, 10, 4, 9, 8} ");
		System.out.println("Digite um número: ");
		numero = leia.nextInt();
		
		for(int indice = 0; indice < vetor.length; indice ++) {
			if(vetor[indice] == numero)/*Ler todo o vetor e verificar se o resultado é igual */
				resultado = indice;
		}
		
		if(resultado == -1)
			System.out.printf("\n O número %d não foi localizado. " ,numero);
		else
		System.out.printf("\n O número %d foi localizado na posição %d. " ,numero, resultado);

	}
}
