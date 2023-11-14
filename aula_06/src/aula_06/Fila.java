package aula_06;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();
		
		fila.add("Aline");
		fila.add("Pedro");
		fila.add("Vinicius");
		fila.add("Luiza");
		fila.add("Maria");
		
		System.out.println(fila); /*Imprimir a fila*/
		
		fila.remove();/*Tirar um elemento da fila (Sempre remove o primiero elemento da minha fila*)*/
		
		System.out.println(fila);
		
		System.out.println(fila.peek());/*Mostra qual é o primeiro elelmento, mas nao o remove*/		
		
		System.out.println(fila);
		
		System.out.println(fila.poll());
		
		System.out.println(fila);
		
		String nome = "Maria";
		
		System.out.println("A Maria está na fila?: " + fila.contains("Maria"));/*Checar se o elemento (Maria) está na minha fila*/
		
		System.out.println("Numero de elementos da fila: " + fila.size());
		
		int contador = 0;
		
		for(var pessoa : fila) {
			contador ++;
			if(pessoa.equalsIgnoreCase("Maria"))/*Checar*/
				System.out.println("Posição: " + contador);
		}
	}

}
