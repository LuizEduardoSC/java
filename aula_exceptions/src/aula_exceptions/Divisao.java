package aula_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Divisao {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		int dividendo = 0;
		int divisor = 0;
		boolean loop = true;

		do {
			
			try {
				System.out.println("Digite o Dividendo: ");
				dividendo = leia.nextInt();

				System.out.println("Digite o Divisor: ");
				divisor = leia.nextInt();

				divide(dividendo, divisor);
				
				loop = false; /* Sair do loop caso não apresente nenhum erro */

			} catch (InputMismatchException e) {
				/* System.err.println("Exception: " + e); */
				leia.nextLine();
				System.out.println("Digite Valores Inteiros!");
			} catch (ArithmeticException e) {
				/* System.err.println("Exception: " + e); */
				leia.nextLine();
				System.out.println("Digite Números Inteiros Positivos!");
			}finally {
				System.out.println("O Finally foi executado!");
			}
			
		} while (loop);
	}

	public static void divide(int dividendo, int divisor) {
		System.out.println("Divisão = " + (dividendo / divisor));
	}
}
