package aula_04;

import java.util.Scanner;

public class TabuadaV2 {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
        int numero, contador = 1;/*Define onde começa a operação*/
		
		System.out.println("Digite um número: ");
		numero = leia.nextInt();
		
		
		while (contador <= 10 /*Limita até onde deve ir*/) {
		    System.out.println(numero + " x " + contador + " = " + (numero * contador));
		    contador ++; /*Serve para incrementar até o final, (e só parar no 10 quando terminar o incremento*/
		
		}
	}
}
