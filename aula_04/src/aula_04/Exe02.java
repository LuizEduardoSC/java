package aula_04;

import java.util.Scanner;

public class Exe02 {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		int par = 0, impar = 0, numero;
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("Digite o " + i + "° numero: ");
			numero = leia.nextInt();
			
			if (numero % 2 == 0)
			par ++; 
			else {
			impar ++;
			}
		}
		
		System.out.println("Total de números pares: " + par);
		System.out.println("Total de números ímpares: " + impar);

	}

}
