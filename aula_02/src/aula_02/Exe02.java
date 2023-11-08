package aula_02;

import java.util.Scanner;

public class Exe02 {
	
	static Scanner Leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		float nota1, nota2, nota3, nota4, mediaFinal;
		
		System.out.println("Digite a primeira nota: ");
		nota1 = Leia.nextFloat();
		
		System.out.println("Digite a segunda nota: ");
		nota2 = Leia.nextFloat();
		
		System.out.println("Digite a terceira nota: ");
		nota3 = Leia.nextFloat();
		
		System.out.println("Digite a quarta nota: ");
		nota4 = Leia.nextFloat();
		
		mediaFinal = (nota1 + nota2 + nota3 + nota4) / 4;
				
		System.out.printf("O valor da média final é: %.1f " , mediaFinal);

	}

}
