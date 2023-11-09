package aula_03;

import java.util.Scanner;

public class Exe01 {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		// Escreva um algoritmo em Java, que leia um número inteiro via
		// teclado e mostre na tela uma mensagem indicando se este número é par 
		// ou ímpar e se o número é positivo ou negativo. Veja os exemplos abaixo:
		
		int numero;
		String paridade, tipo;
		
		System.out.println("Digite o valor: ");
		numero = leia.nextInt();

		if (numero % 2 == 0) {
			paridade = "Par";
		} 
		else {
			paridade = "Ímpar";
		}
		if (numero >= 0) {
			tipo = "Positivo";
		} 
		else {
			tipo = "Negativo";
		}
		
		System.out.printf("O Número é %s e %s!", paridade, tipo);
	}

}