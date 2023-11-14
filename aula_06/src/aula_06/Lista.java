package aula_06;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {
		
		
		ArrayList<Double> notas = new ArrayList<Double>(); /*"notas" seria a collection*/
		
		notas.add(7.0);
		notas.add(4.0);
		notas.add(6.0);
		notas.add(7.0);
		notas.add(9.0);
		
		for(var nota : notas)
			System.out.println(nota); /**/
		
		System.out.println(notas);
		
		System.out.println("Posição do elemento 7: " + notas.indexOf(7.0));
		
		System.out.println("\nExiste o elemento 7? " + notas.contains(7.0));
		
		System.out.println("\nElemento na posição 0 " + notas.get(0)); /*"notas.get" usa-se para buscar o elemento na linha*/

		notas.remove(3);
		
		System.out.println(notas);
		
		notas.forEach(System.out::println); /*"::" Serve para simplificar o for Each e escrever em apenas uma linha*/
		
		notas.clear(); /*Apaga toda a lista*/
		
		System.out.println("A lista está vazia? " + notas.isEmpty());
	}

}
