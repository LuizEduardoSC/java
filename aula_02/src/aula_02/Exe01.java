package aula_02;

import java.util.Scanner;

public class Exe01 {
	
	static Scanner Leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		float salario, abono, novoSalario;
		
		System.out.println("Digite o seu salário:");
		salario = Leia.nextFloat();
		
		System.out.println("Digite o seu abono:");
		abono = Leia.nextFloat();
		
		novoSalario = (salario + abono);
		
		System.out.println("Seu novo salário é: " + novoSalario);
		salario = Leia.nextFloat();

	}

}
