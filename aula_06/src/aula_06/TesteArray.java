package aula_06;

import java.util.ArrayList;
import java.util.Collections;

public class TesteArray {

	public static void main(String[] args) {
		
		ArrayList<Double> notas = new ArrayList<>();
		
		notas.add(7.0);
		notas.add(5.0);
		notas.add(4.0);
		notas.add(10.0);
		
		//Mostra na tela todas as notas inseridas
		System.out.println("\nNotas cadastradas: " + notas.toString());
		
		//Mostra uma determinada nota existe na lista
		System.out.println("\nA nota 5 existe na lista? " + notas.contains(5d));
		
		notas.set(1, 6.0d);
		System.out.println("\nA nota 5 foi alterada para 6: " + notas.toString());
		
		notas.remove(1);
		System.out.println("\nA nota 4 foi apagada: " + notas.toString());
		
		//Checa se a lista está vazia
		System.out.println("\nA lista está vazia? " + notas.isEmpty());
		
		//Exibe o tamanho da lista (número de elementos)
		System.out.println("\nO tamanho da lista é: " + notas.size());
		
		//Exibe o maior valor da lista
		System.out.println("\nA maior nota da lista é: " + Collections.max(notas));
		
		//Exibe o menor valor da lista
		System.out.println("\nA menor nota da lista é: " + Collections.min(notas));
		
		//Limpa a lista
		notas.clear();
		System.out.println("\nA lista está vazia: " + notas.toString());

	}

}
