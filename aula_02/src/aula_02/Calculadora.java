package aula_02;

import java.util.Scanner;

public class Calculadora {
	
	static Scanner Leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		double numero1, numero2;
		
		System.out.println("Digite o primeiro número: ");
		numero1 = Leia.nextDouble();
		
		System.out.println("Digite o segundo número: ");
		numero2 = Leia.nextDouble();
		
		System.out.println("Soma: " + (numero1 + numero2));
		System.out.println("Subtração: " + (numero1 - numero2));	
		System.out.println("Multiplicação: " + (numero1 * numero2));
		System.out.println("Divisão: " + (numero1 / numero2));
		System.out.println("Módulo do número 1 (Resto da divisão): " + (numero1%2));
		System.out.println("Módulo do número 2 (Resto da divisão): " + (numero2%2));
		
		System.out.println("Raiz quadrada do número 1: " + (Math.sqrt(numero1)));
		
		System.out.println("Potenciação do número 1 pelo número 2: " + (Math.pow(numero1, numero2)));
		
		

	}

}
