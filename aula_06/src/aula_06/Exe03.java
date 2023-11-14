package aula_06;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Exe03 {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		HashSet<Integer> numeros = new HashSet<Integer>();		
		
		System.out.println("Digite 10 valores inteiros não repetidos: ");
		for (int i = 0; i < 10; i++) {
			Integer num = leia.nextInt();
			numeros.add(num);
		}
		
		System.out.println("Listar dados do Set: ");
		
		Iterator<Integer> iNum = numeros.iterator();
		
		while (iNum.hasNext()) {
            int numero = iNum.next();
            System.out.println(numero);
        }
	}
}
